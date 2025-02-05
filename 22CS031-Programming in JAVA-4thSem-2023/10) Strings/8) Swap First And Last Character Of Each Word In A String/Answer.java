class Result {
    static String swapFirstLastChar(String str) {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (word.length() > 1) {
                result.append(word.charAt(word.length() - 1))
                      .append(word.substring(1, word.length() - 1))
                      .append(word.charAt(0))
                      .append(" ");
            } else {
                result.append(word).append(" ");
            }
        }
        return result.toString().trim();
    }
}