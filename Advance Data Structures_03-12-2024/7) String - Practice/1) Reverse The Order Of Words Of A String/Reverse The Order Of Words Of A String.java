class Result {
  static String revWordsOrder(String str) {
      String[] arr = str.split(" ");
      int low = 0, high = arr.length - 1;
      while(low < high) {
          String temp = arr[low];
          arr[low] = arr[high];
          arr[high] = temp;
          low++;high--;
      }
      String res = String.join(" ",arr);
      return res;
  }
}