int maxElement(int arr[], int N) {
    int maxElem = arr[0];
    for (int i = 1; i < N; ++i) {
        if (arr[i] > maxElem) {
            maxElem = arr[i];
        }
    }
    return maxElem;
}