static Node rearrangeList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node oddHead = null, oddTail = null, evenHead = null, evenTail = null;
        Node current = head;
        int pos = 1;
        // Separate the nodes into odd and even
        while (current != null) {
            if (pos % 2 == 1) {
                // Odd node
                if (oddHead == null) {
                    oddHead = current;
                    oddTail = current;
                } else {
                    oddTail.next = current;
                    current.prev = oddTail;
                    oddTail = oddTail.next;
                }
            } else {
                // Even node
                if (evenHead == null) {
                    evenHead = current;
                    evenTail = current;
                } else {
                    evenTail.next = current;
                    current.prev = evenTail;
                    evenTail = evenTail.next;
                }
            }
            current = current.next;
            pos++;
        }
        // Ensure the last node of both lists does not point to any other node
        if (oddTail != null) {
            oddTail.next = null;
        }
        if (evenTail != null) {
            evenTail.next = null;
        }
        // Now combine the even list with the odd list
        if (evenHead == null) {
            return oddHead;
        }
        evenTail.next = oddHead;
        if (oddHead != null) {
            oddHead.prev = evenTail;
        }
        return evenHead;  // New head will be the head of the even list
    }