class Result {
  static void deleteNode(Node n1) {
      if(n1 == null || n1.next == null) return;
      n1.data = n1.next.data;
      n1.next = n1.next.next;
  }
}