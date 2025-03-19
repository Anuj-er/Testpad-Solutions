static void reverseKelementsQueue(QueueArray q, int K) {
    if (q.front == -1 || q.front > q.rear || K <= 0) return; 
    Stack<Integer> stack = new Stack<>();
    int size = q.rear - q.front + 1;
    K = Math.min(K, size); 
    for (int i = 0; i < K; i++) {
        stack.push(q.dequeue());
    }
    int[] remaining = new int[size - K];
    for (int i = 0; i < size - K; i++) {
        remaining[i] = q.dequeue();
    }
    while (!stack.isEmpty()) {
        q.enqueue(stack.pop());
    }
    for (int i = 0; i < size - K; i++) {
        q.enqueue(remaining[i]);
    }
}
