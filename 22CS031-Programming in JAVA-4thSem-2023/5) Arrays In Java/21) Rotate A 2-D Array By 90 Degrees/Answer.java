import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[][] arr = new int[N][N];
            // Reading the matrix
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            // Rotating the matrix by 90 degrees
            rotateBy90Degrees(arr, N);
            // Print a blank line after each test case, except the last one
            if (T > 0) {
                System.out.println();
            }
        }
    }
    static void rotateBy90Degrees(int[][] arr, int N) {
        int[][] result = new int[N][N];
        // Perform the rotation
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                result[j][N - i - 1] = arr[i][j];
            }
        }
        // Print the rotated matrix
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(result[i][j]);
                if (j < N - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}