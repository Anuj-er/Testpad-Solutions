static LinkList deleteBeg(LinkList head) {
    if (head == null) return null; // Empty list case
    if (head.next == head) return null; // Single node case
    LinkList tail = head;
    while (tail.next != head) { // Find the last node
        tail = tail.next;
    }
    head = head.next; // Move head to next node
    tail.next = head; // Update last node's next to new head
    return head;
}
static LinkList deleteEnd(LinkList head) {
    if (head == null) return null; // Empty list case
    if (head.next == head) return null; // Single node case
    LinkList prev = null, curr = head;
    while (curr.next != head) { // Find last node
        prev = curr;
        curr = curr.next;
    }
    prev.next = head; // Make second-last node point to head
    return head;
}