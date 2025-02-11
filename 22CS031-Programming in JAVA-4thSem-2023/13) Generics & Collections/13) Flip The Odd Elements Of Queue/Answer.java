static void flipHalfQueue(Queue<Integer> q) 
  {
    Stack<Integer> stack = new Stack<>();
    Queue<Integer> tempQueue = new LinkedList<>();
    int size = q.size();
    for (int i = 0; i < size; i++) {
      int val = q.poll();
      if (i % 2 == 1) {
        stack.push(val);
      }
      tempQueue.offer(val);
    }
    for (int i = 0; i < size; i++) {
      int val = tempQueue.poll();
      if (i % 2 == 1) {
        q.offer(stack.pop()); 
      } else {
        q.offer(val); 
      }
    }
  }