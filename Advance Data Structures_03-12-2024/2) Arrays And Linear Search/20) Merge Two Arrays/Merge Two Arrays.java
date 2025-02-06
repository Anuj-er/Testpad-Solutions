int* mergeArrays(int a[], int b[], int asize, int bsize) {
    int* result = (int*)malloc((asize + bsize) * sizeof(int));
    int i = 0, j = 0, k = 0;
    while (i < asize && j < bsize) {
        if (a[i] < b[j]) {
            result[k++] = a[i++];
        } else {
            result[k++] = b[j++];
        }
    }
    while (i < asize) {
        result[k++] = a[i++];
    }
    while (j < bsize) {
        result[k++] = b[j++];
    }
    return result;
}