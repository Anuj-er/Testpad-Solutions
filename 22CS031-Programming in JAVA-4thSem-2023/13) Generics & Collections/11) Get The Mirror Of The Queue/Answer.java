static void mirrorQueue(Queue<String> q) {
    Stack<String> stack = new Stack<>();
    int size = q.size();
    for (int i = 0; i < size; i++) {
        String element = q.poll();
        q.add(element); 
        stack.push(element);
    }
    while (!stack.isEmpty()) {
        q.add(stack.pop());
    }
}