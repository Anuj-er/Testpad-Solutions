static int isCircular(Node head) {
    if (head == null) return 1; // An empty list is circular by definition
    Node slow = head, fast = head;
    while (fast != null && fast.next != null) {
        slow = slow.next;         // Move slow by 1 step
        fast = fast.next.next;    // Move fast by 2 steps
        if (slow == fast) {
            // If slow meets fast, check if it loops back to head
            Node check = slow;
            while (check.next != head && check.next != slow) {
                check = check.next;
            }
            return (check.next == head) ? 1 : 0;
        }
    }
    return 0; // No cycle found, so it's not circular
}