class Result {
    static int minReversal(String expr) {
        int length = expr.length();
        if (length % 2 != 0) {
            return -1;
        }
        Stack<Character> stack = new Stack<>();
        for (char ch : expr.toCharArray()) {
            if (ch == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        int openBrackets = 0, closeBrackets = 0;
        while (!stack.isEmpty()) {
            if (stack.pop() == '[') {
                openBrackets++;
            } else {
                closeBrackets++;
            }
        }
        return (int) (Math.ceil(openBrackets / 2.0) + Math.ceil(closeBrackets / 2.0));
    }
}