class Result {
  static int countWords(String str) {
      if(str.trim().isEmpty()) {
            return 0;  
      }
      String[] arr = str.trim().split("\\s+");
      return arr.length;
  }
}