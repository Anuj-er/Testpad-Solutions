import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int t = sc.nextInt();
        while(t > 0) {
            int idx = sc.nextInt();
            try {
                if(idx >= 0 && idx < n) {
                    System.out.println(arr[idx]);
                } else {
                    throw new Exception("Out of Bounds");
                }
            } catch(Exception e) {
                System.out.println(e.getMessage());
            }
            t--;
        }
    }
}