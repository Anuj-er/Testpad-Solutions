class Result{
  static boolean strSubsequence(String str1, String str2) {
      int i = 0, j = 0;
      int len1 = str1.length(), len2 = str2.length();
      while(i < len1 && j < len2) {
          if(str1.charAt(i) == str2.charAt(j)) {
              j++;
          }
          i++;
      }
      if(j == len2) return true;
      return false;
  }
}