private int[] minValues = new int[100]; 
private int minTop = -1;

public void push(int j) 
{
    if (isFull()) {
        return;
    }
    
    top++;
    stackArray[top] = j;
    
    
    if (minTop == -1 || j <= minValues[minTop]) {
        minTop++;
        minValues[minTop] = j;
    }
}

public int pop() 
{
    if (isEmpty()) {
        return -1; 
    }
    
    int value = stackArray[top];
    top--;
    
    
    if (value == minValues[minTop]) {
        minTop--;
    }
    
    return value;
}

public int getMin()
{
    if (isEmpty() || minTop == -1) {
        return -1; 
    }
    
    return minValues[minTop];
}
