int kthLargest(int arr[], int size, int k) {
    int left = 0, right = size - 1;
    while (left <= right) {
        int pivot = arr[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (arr[j] >= pivot) {
                i++;
                swap(arr[i], arr[j]);
            }
        }
        swap(arr[i + 1], arr[right]);
        int pivotIndex = i + 1;
        if (pivotIndex == k) {
            return arr[pivotIndex];
        } else if (pivotIndex < k) {
            left = pivotIndex + 1;
        } else {
            right = pivotIndex - 1;
        }
    }
    return -1;
}