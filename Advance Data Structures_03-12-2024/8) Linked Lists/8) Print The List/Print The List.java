static void forwardPrint(Node head) {
    Node temp = head;
    while(temp != null) {
        System.out.print(temp.data + "-");
        temp = temp.next;
    }
}
static void backwardPrint(Node head) {
    if(head == null) return;
    backwardPrint(head.next);
    System.out.print(head.data + "-");
}