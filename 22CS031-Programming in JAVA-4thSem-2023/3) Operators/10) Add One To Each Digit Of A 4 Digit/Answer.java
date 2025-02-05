import java.util.Scanner;
class Main
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d1 = (n / 1000 + 1) % 10;
        int d2 = (n / 100 % 10 + 1) % 10;
        int d3 = (n / 10 % 10 + 1) % 10;
        int d4 = (n % 10 + 1) % 10;
        System.out.println(d1 * 1000 + d2 * 100 + d3 * 10 + d4);
        scanner.close();
  }
}