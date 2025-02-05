static String capitalizeFirstChar(String str) {
    String[] words = str.split(" ");
    StringBuilder result = new StringBuilder();
    for (String word : words) {
        result.append(Character.toUpperCase(word.charAt(0)))
              .append(word.substring(1))
              .append(" ");
    }
    return result.toString().trim();
}