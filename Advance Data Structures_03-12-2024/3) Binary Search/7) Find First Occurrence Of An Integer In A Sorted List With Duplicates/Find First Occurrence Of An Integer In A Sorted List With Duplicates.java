import java.util.Scanner;
class Main{
    public static int findOccurence(int n, int K, int[] arr) {
        int left = 0, right = n - 1;
        int res = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == K) {
                res = mid;
                right = mid - 1;
            } else if (arr[mid] < K) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return res;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            System.out.println(findOccurence(n,k,arr));
            t--;
        }
    }
}