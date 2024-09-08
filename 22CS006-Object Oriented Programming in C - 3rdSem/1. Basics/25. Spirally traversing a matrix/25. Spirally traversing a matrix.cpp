void printSpiral(int a[50][50], int r, int c) {
    int top = 0, bottom = r - 1;
    int left = 0, right = c - 1;
    while (top <= bottom && left <= right) {
        // Traverse from left to right along the top row
        for (int i = left; i <= right; ++i) {
            cout << a[top][i] << endl;
        }
        top++;
        // Traverse from top to bottom along the right column
        for (int i = top; i <= bottom; ++i) {
            cout << a[i][right] << endl;
        }
        right--;
        // Traverse from right to left along the bottom row
        if (top <= bottom) {
            for (int i = right; i >= left; --i) {
                cout << a[bottom][i] << endl;
            }
            bottom--;
        }
        // Traverse from bottom to top along the left column
        if (left <= right) {
            for (int i = bottom; i >= top; --i) {
                cout << a[i][left] << endl;
            }
            left++;
        }
    }
}