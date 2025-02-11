class Result {
    static int evalPrefix(CQStack s, String exp) {
        for (int i = exp.length() - 1; i >= 0; i--) {
            char ch = exp.charAt(i);
            if (Character.isDigit(ch)) {
                s.push(ch - '0');
            } else {
                int a = s.pop(); 
                int b = s.pop(); 
                switch (ch) {
                    case '+': s.push(a + b); break;
                    case '-': s.push(a - b); break;
                    case '*': s.push(a * b); break;
                    case '/': s.push(a / b); break; 
                    case '^': s.push((int) Math.pow(a, b)); break;
                }
            }
        }
        return s.pop(); // Final result
    }
}