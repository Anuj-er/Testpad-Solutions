static void doubleQueue(Queue<Integer> q) {
    int size = q.size();
    for (int i = 0; i < size; i++) {
        int element = q.poll(); 
        q.add(element); 
        q.add(element);
    }
}