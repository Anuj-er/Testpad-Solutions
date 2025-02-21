// Method to add an item to the queue.
    void enqueue(int item) {
        if (rear == SIZE - 1) {
            return; // Queue overflow
        }
        if (front == -1) {
            front = 0;
        }
        array[++rear] = item;
    }

    // Method to remove an item from queue.
    int dequeue() {
        if (front == -1 || front > rear) {
            return -1; // Queue underflow
        }
        return array[front++];
    }
}
