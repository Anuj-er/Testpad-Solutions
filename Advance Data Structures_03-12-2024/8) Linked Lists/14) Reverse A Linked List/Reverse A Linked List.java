class Result {
  static Node reverseList(Node head) {
      Node prev = null;
      Node curr = head;
      while(curr != null) {
          Node next = curr.next;
          curr.next = prev;
          prev = curr;
          curr = next;
      }
      return prev;
  }
}