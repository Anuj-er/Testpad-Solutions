class CQStack {
    public int maxSize; 
    public int[] stackArray;
    public int top; 
    public CQStack(int s) {
      maxSize = s;
      stackArray = new int[maxSize];
      top = -1; 
    }
    public void push(int j) {
      if (isFull()) {
        return; 
      }
      stackArray[++top] = j;
    }
    public int pop() {
      if (isEmpty()) {
        return -1; 
      }
      return stackArray[top--];
    }
    public boolean isEmpty() {
      return (top == -1);
    }
    public boolean isFull() {
      return (top == maxSize - 1);
    }
  }