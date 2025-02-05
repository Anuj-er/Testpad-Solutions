class Result {
    public static int findOddMan(int n, int arr[]) {
      int result = 0;
      for (int num : arr) { 
          result ^= num;
      }
      return result;
    }
  }