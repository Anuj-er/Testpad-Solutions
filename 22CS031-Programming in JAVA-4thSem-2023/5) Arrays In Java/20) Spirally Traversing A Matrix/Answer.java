class Result {
    static void printSpiral(int a[][], int r, int c) {
        int top = 0, left = 0;
        int bottom = r - 1, right = c - 1;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                System.out.println(a[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                System.out.println(a[i][right]);
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.println(a[bottom][i]);
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.println(a[i][left]);
                }
                left++;
            }
        }
    }
}