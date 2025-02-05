import java.util.Scanner;
class Main
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
        // Input: Marks for five subjects
        int subject1 = scanner.nextInt();
        int subject2 = scanner.nextInt();
        int subject3 = scanner.nextInt();
        int subject4 = scanner.nextInt();
        int subject5 = scanner.nextInt();
        // Calculate the aggregate marks
        int aggregate = subject1 + subject2 + subject3 + subject4 + subject5;
        // Calculate the percentage marks
        int percentage = aggregate / 5; // Each subject is out of 100
        // Output: Aggregate and Percentage
        System.out.println(aggregate + " " + percentage);
        scanner.close();
  }
}