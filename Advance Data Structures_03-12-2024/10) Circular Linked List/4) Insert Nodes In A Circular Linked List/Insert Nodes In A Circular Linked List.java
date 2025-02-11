static LinkList insertBeg(LinkList head, int data) {
    LinkList newNode = new LinkList(data);
    if (head == null) {
        newNode.next = newNode; // Self-loop since it's the first node
        return newNode;
    }
    // Find the last node (tail)
    LinkList tail = head;
    while (tail.next != head) {
        tail = tail.next;
    }
    // Insert new node at beginning
    newNode.next = head;
    tail.next = newNode; // Update last node's next pointer to new head
    return newNode; // New head
}
static LinkList insertEnd(LinkList head, int data) {
    LinkList newNode = new LinkList(data);
    if (head == null) {
        newNode.next = newNode; // Self-loop since it's the first node
        return newNode;
    }
    // Find the last node (tail)
    LinkList tail = head;
    while (tail.next != head) {
        tail = tail.next;
    }
    // Insert new node at end
    tail.next = newNode;
    newNode.next = head; // Circular link maintained
    return head; // Head remains unchanged
}