import java.util.Scanner;
class Result { 
    static int decimalToBinary(int n) { 
        if (n == 0) {
            return 0;
        }
        int binary = decimalToBinary(n / 2);
        return binary * 10 + (n % 2);
    } 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of test cases: ");
        int testCases = scanner.nextInt();
        for (int i = 0; i < testCases; i++) {
            System.out.print("Enter a decimal number: ");
            int n = scanner.nextInt();
            int result = decimalToBinary(n);
            System.out.println(result);
        }
    }
}