static Node copyList(Node head) {
        if (head == null) {
            return null;  
        }
        Node L2 = new Node(head.data);
        Node tempOriginal = head.next;
        Node tempCopy = L2;
        while (tempOriginal != null) {
            Node newNode = new Node(tempOriginal.data);
            tempCopy.next = newNode;
            tempCopy = tempCopy.next;
            tempOriginal = tempOriginal.next;
        }
        return L2;
}