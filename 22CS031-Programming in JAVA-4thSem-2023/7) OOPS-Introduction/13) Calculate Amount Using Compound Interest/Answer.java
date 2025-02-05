import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double principal = sc.nextDouble();
        double rate = sc.nextDouble();
        double time = sc.nextDouble();
        double amount = principal * Math.pow((1 + rate / 100), time);
        System.out.printf("%.1f", amount);
    }
}