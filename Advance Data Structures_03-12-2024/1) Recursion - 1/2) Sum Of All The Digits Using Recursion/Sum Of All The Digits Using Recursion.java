import java.util.Scanner;
class Main {
    public static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sumOfDigits(n / 10);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int no = scanner.nextInt();
            if (no < 0) {
                System.out.println(-sumOfDigits(-no));
            } else {
                System.out.println(sumOfDigits(no));
            }
        }
        scanner.close();
    }
}