class Result {
  static Node reverse(Node head) {
      Node curr = head, prev = null;
      while(curr != null) {
          Node next = curr.next;
          curr.next = prev;
          prev = curr;
          curr = next;
      }
      return prev;
  }
  static int checkPalindrome(Node head) {
      if(head == null || head.next == null) return 1;
      Node fast = head;
      Node slow = head;
      while(fast != null && fast.next != null) {
          slow = slow.next;
          fast = fast.next.next;
      }
      Node secondHalf = reverse(slow);
      Node temp1 = head;
      Node temp2 = secondHalf;
      while(temp2 != null) {
          if(temp1.data != temp2.data) return 0;
          temp1 = temp1.next;
          temp2 = temp2.next;
      }
      return 1;
  }
}