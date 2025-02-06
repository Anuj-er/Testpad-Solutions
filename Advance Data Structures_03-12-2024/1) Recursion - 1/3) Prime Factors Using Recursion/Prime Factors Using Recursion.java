import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        primeFactors(n, 2);
    }
    public static void primeFactors(int n, int divisor) {
        if (n == 1) {
            return;
        }
        if (n % divisor == 0) {
            System.out.println(divisor);
            primeFactors(n / divisor, divisor);
        } else {
            primeFactors(n, divisor + 1);
        }
    }
}