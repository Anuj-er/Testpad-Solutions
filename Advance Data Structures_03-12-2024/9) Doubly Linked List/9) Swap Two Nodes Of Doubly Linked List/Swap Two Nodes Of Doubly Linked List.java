Node swapNodes(Node head, int x, int y) {
    if (x == y || head == null) {
        return head; // No swapping needed if x and y are the same or the list is empty
    }
    Node nodeX = null, nodeY = null, current = head;
    // Find nodes x and y
    while (current != null) {
        if (current.data == x) {
            nodeX = current;
        } else if (current.data == y) {
            nodeY = current;
        }
        current = current.next;
        // Break early if both nodes are found
        if (nodeX != null && nodeY != null) {
            break;
        }
    }
    // If either x or y is not found, return the original head
    if (nodeX == null || nodeY == null) {
        return head;
    }
    // Swap the previous pointers
    if (nodeX.prev != null) {
        nodeX.prev.next = nodeY;
    } else {
        head = nodeY; // Update head if x is the head
    }
    if (nodeY.prev != null) {
        nodeY.prev.next = nodeX;
    } else {
        head = nodeX; // Update head if y is the head
    }
    // Swap the next pointers
    if (nodeX.next != null) {
        nodeX.next.prev = nodeY;
    }
    if (nodeY.next != null) {
        nodeY.next.prev = nodeX;
    }
    // Swap the nodeX and nodeY links
    Node temp = nodeX.next;
    nodeX.next = nodeY.next;
    nodeY.next = temp;
    temp = nodeX.prev;
    nodeX.prev = nodeY.prev;
    nodeY.prev = temp;
    return head; // Return updated head
}