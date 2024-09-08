int * mergeArrays(int a[], int b[], int asize, int bsize) {
  int* mergedArray = new int[asize + bsize];
    int i = 0, j = 0, k = 0;
    while (i < asize && j < bsize) {
        if (a[i] <= b[j]) {
            mergedArray[k++] = a[i++];
        } else {
            mergedArray[k++] = b[j++];
        }
    }
    while (i < asize) {
        mergedArray[k++] = a[i++];
    }
    while (j < bsize) {
        mergedArray[k++] = b[j++];
    }
    return mergedArray;
}