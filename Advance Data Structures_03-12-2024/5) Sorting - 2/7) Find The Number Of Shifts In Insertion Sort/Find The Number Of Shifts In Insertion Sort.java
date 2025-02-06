#include <stdio.h>
int insertionSortShifts(int arr[], int n) {
    int shifts = 0;
    for (int i = 1; i < n; i++) {
        int key = arr[i];
        int j = i - 1;
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
            shifts++;
        }
        arr[j + 1] = key;
        if (j + 1 != i) {
            shifts++; 
        }
    }
    return shifts;
}
int main() {
    int T;
    scanf("%d", &T);
    while (T--) {
        int N;
        scanf("%d", &N);
        int arr[N];
        for (int i = 0; i < N; i++) {
            scanf("%d", &arr[i]); 
        }
        int shiftCount = insertionSortShifts(arr, N);
        printf("%d\n", shiftCount);
    }
    return 0;
}