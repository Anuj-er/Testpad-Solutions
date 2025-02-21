static void reverseQueue(QueueArray q) {
    if (q.front == -1 || q.front > q.rear) return; 
    int size = q.rear - q.front + 1; 
    int[] temp = new int[size];  
    int index = 0;
    while (q.front <= q.rear) {  
        temp[index++] = q.dequeue();
    }
    q.front = -1;
    q.rear = -1;
    for (int i = size - 1; i >= 0; i--) {
        q.enqueue(temp[i]);
    }
}
