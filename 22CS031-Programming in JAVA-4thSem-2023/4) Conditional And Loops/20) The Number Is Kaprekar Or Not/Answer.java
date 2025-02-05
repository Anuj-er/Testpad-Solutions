import java.util.Scanner;
// Other imports go here// Do NOT change the class name
class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        while (testCases-- > 0) {
            int n = scanner.nextInt();
            System.out.println(isKaprekar(n) ? 1 : 0);
        }
        scanner.close();
    }
    static boolean isKaprekar(int n) {
        if (n == 1) return true;
        long square = (long) n * n;
        String squareStr = String.valueOf(square);
        int len = squareStr.length();
        for (int i = 1; i < len; i++) {
            int left = Integer.parseInt(squareStr.substring(0, i));
            int right = Integer.parseInt(squareStr.substring(i));
            if (right > 0 && left + right == n) {
                return true;
            }
        }
        return false;
    }
}