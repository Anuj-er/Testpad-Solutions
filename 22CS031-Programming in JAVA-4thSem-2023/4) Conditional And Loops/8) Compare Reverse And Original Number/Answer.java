import java.util.Scanner;
// Other imports go here// Do NOT change the class name
class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            int n = scanner.nextInt();
            int original = n;
            int reversed = 0;
            while (n != 0) {
                int digit = n % 10;
                reversed = reversed * 10 + digit;
                n /= 10;
            }
            if (original == reversed) {
                System.out.println("Equal");
            } else {
                System.out.println("Not Equal");
            }
        }
        scanner.close();
    }
}