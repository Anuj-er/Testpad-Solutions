class Result {
    static LinkList listCut(LinkList head) {
      if (head == null || head.next == head) return null; 
      LinkList slow = head, fast = head;
      while (fast.next != head && fast.next.next != head) {
        slow = slow.next;
        fast = fast.next.next;
      }
      LinkList head2 = slow.next; 
      slow.next = head;
      LinkList temp = head2;
      while (temp.next != head) {
        temp = temp.next;
      }
      temp.next = head2;
      return head2;
    }
  }