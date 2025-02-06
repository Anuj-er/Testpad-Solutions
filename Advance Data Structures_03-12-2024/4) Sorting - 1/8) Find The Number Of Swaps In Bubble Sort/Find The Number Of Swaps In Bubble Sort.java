import java.util.Scanner;
public class Main {
    public static int bubbleCount(int[] arr, int n) {
        int swapCount = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapCount++;  
                }
            }
        }
        return swapCount;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t > 0) {
            int n = sc.nextInt();  
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();  
            }
            System.out.println(bubbleCount(arr, n));
            t--;
        }
    }
}