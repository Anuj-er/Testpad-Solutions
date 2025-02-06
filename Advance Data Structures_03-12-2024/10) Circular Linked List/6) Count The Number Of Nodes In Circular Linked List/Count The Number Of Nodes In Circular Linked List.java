class Result {
  static int countNodes(Node head) {
      if(head == null) return 0;
      Node fast = head, slow = head;
      while(fast != null && fast.next != null) {
          slow = slow.next;
          fast = fast.next.next;
          if(slow == fast) {
              Node cycleNode = slow;
              int count = 1;
              while (cycleNode.next != slow) {
                  cycleNode = cycleNode.next;
                  count++;
              }
              return count;
          }
      }
      return 0;
  }
}