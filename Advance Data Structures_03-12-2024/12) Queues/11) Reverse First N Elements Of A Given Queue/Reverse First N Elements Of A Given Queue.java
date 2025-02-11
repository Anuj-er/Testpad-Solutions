
static void reverseKelementsQueue(QueueArray q, int K) {
    if (q.front == -1 || q.front > q.rear || K <= 0) return; // Edge case check
    Stack<Integer> stack = new Stack<>();
    int size = q.rear - q.front + 1;
    K = Math.min(K, size); // Ensure K does not exceed queue size
    // Step 1: Push first K elements to stack
    for (int i = 0; i < K; i++) {
        stack.push(q.dequeue());
    }
    // Step 2: Store remaining elements separately
    int[] remaining = new int[size - K];
    for (int i = 0; i < size - K; i++) {
        remaining[i] = q.dequeue();
    }
    // Step 3: Reinsert reversed K elements
    while (!stack.isEmpty()) {
        q.enqueue(stack.pop());
    }
    // Step 4: Reinsert remaining elements
    for (int i = 0; i < size - K; i++) {
        q.enqueue(remaining[i]);
    }
}
