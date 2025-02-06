static String reverseString(CQStack s, String st) {
    for (int i = 0; i < st.length(); i++) {
        s.push(st.charAt(i));
    }
    StringBuilder res = new StringBuilder();
    char c;
    while (!s.isEmpty()) {
        c = (char) s.pop();
        res.append(c);
    }
    return res.toString();
}