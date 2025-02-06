class Result {
    static String getDesiredString(String str) {
        StringBuilder res = new StringBuilder();
        res.append(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(i - 1)) {
                res.append(str.charAt(i));
            }
        }
        return res.toString();
    }
}