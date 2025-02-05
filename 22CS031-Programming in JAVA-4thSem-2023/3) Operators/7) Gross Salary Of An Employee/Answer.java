import java.util.Scanner;
class Main
{
  public static void main(String[] args)
  {
        Scanner scanner = new Scanner(System.in);
        // Input: Basic Salary
        int basicSalary = scanner.nextInt();
        // Calculate HRA and DA
        double HRA = 0.10 * basicSalary; // 10% of basic salary
        double DA = 0.20 * basicSalary; // 20% of basic salary
        // Calculate Gross Salary
        double grossSalary = basicSalary + HRA + DA;
        // Output: Gross Salary
        System.out.println((int)grossSalary);
        scanner.close();
    }
}