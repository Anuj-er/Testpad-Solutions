class Result {
    static LinkList insertSorted(LinkList head, int data) {
      LinkList newNode = new LinkList(data);
      if (head == null) {
        newNode.next = newNode; // Circular link to itself
        return newNode;
      }
      LinkList curr = head;
      LinkList prev = null;
      if (data <= head.data) {
        while (curr.next != head) {
          curr = curr.next;
        }
        curr.next = newNode;
        newNode.next = head;
        return newNode; // New head
      }
      curr = head;
      while (curr.next != head && curr.next.data < data) {
        curr = curr.next;
      }
      newNode.next = curr.next;
      curr.next = newNode;
      return head; // Head remains unchanged
    }
  }