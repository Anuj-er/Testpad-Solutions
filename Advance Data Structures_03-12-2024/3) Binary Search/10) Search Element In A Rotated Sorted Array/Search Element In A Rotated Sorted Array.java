class Result {
  static int searchRotatedSortedArray(int arr[], int k) {
      int low = 0, high = arr.length - 1;
      while(low <= high) {
          int mid = low + (high - low) / 2;
          if(arr[mid] == k) {
              return mid;
          } else if(arr[mid] >= arr[low]) {
              if(k >= arr[low] && k < arr[mid]) {
                  high = mid - 1;
              } else {
                  low = mid + 1;
              }
          } else {
              if(k > arr[mid] && k <= arr[high]) {
                  low = mid + 1;
              } else {
                  high = mid - 1;
              }
          }
      }
      return -1;
  }
}