static LinkList rotateByK(LinkList head, int k) {
    if (head == null || k == 0) return head;
    LinkList current = head;
    int length = 1;
    while (current.next != null) {
        current = current.next;
        length++;
    }
    k = k % length;
    if (k == 0) return head;
    LinkList kthNode = head;
    for (int i = 1; i < length - k; i++) {
        kthNode = kthNode.next;
    }
    LinkList newHead = kthNode.next;
    if (newHead == null) return head;
    kthNode.next = null;
    newHead.prev = null;
    current.next = head;
    head.prev = current;
    return newHead;
}