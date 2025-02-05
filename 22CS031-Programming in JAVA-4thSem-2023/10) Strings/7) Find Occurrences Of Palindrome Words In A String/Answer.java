static int countPalindrome(String str) {
    String[] words = str.split("\\s+");
    int palindromeCount = 0;
    for (String word : words) {
        if (isPalindrome(word)) {
            palindromeCount++;
        }
    }
    return palindromeCount;
}
static boolean isPalindrome(String word) {
    word = word.toLowerCase();
    int left = 0, right = word.length() - 1;
    while (left < right) {
        if (word.charAt(left) != word.charAt(right)) {
            return false;
        }
        left++;
        right--;
    }
    return true;
}