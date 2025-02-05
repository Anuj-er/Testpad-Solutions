import java.util.Scanner;
class Main
{
  public static void main(String[] args)
  {
    String id;
    Scanner s1 = new Scanner(System.in);
    id = s1.nextLine();
    try {
      if (!id.contains("@") || !id.contains(".") || id.indexOf('.') < id.indexOf('@')) {
        throw new Exception();
      }
      System.out.println("Valid");
    } catch (Exception e) {
      System.out.println("Invalid");
    }
  }
}