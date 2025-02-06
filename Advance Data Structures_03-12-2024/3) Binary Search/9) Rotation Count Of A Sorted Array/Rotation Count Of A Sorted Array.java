import java.util.Scanner;
class Main {
    public static int countRotation(int[] arr, int n)
    {
        int low = 0, high = n - 1;
        if(arr[low] <= arr[high]) {
            return -1;
        }
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] > arr[mid + 1]) {
                return mid + 1;
            } else if (arr[mid] < arr[low]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return 0;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            System.out.println(countRotation(arr,n));
        }
    }
}