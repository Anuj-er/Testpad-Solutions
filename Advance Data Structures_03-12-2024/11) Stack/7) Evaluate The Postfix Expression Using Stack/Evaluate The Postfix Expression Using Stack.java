static int evalPostfix(CQStack s, String exp) {
    for (char ch : exp.toCharArray()) {
        if (Character.isDigit(ch)) {
            s.push(ch - '0');
        } else {
            int b = s.pop(); 
            int a = s.pop(); 
            switch (ch) {
                case '+': s.push(a + b); break;
                case '-': s.push(a - b); break;
                case '*': s.push(a * b); break;
                case '/': s.push(a / b); break; 
                case '^': s.push((int) Math.pow(a, b)); break;
            }
        }
    }
    return s.pop(); 
}