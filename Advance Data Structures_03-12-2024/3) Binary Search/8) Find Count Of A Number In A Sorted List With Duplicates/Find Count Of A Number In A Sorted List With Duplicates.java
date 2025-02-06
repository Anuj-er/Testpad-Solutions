import java.util.Scanner;
class Main {
    public static int findFirstOccurence(int[] arr, int n, int k) 
    {
        int low = 0, high = n - 1;
        int first = -1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] == k) {
                first = mid;
                high = mid - 1;
            } else if(arr[mid] < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return first;
    }
    public static int findLastOccurence(int[] arr, int n, int k) 
    {
        int low = 0, high = n - 1;
        int last = -1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] == k) {
                last = mid;
                low = mid + 1;
            } else if(arr[mid] < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return last;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            int first = findFirstOccurence(arr,n,k);
            int last = findLastOccurence(arr,n,k);
            if (first == -1) {
                System.out.println(0);
            } else {
                System.out.println(last - first + 1);
            }
        }
    }
}