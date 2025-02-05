import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String password = sc.next();        
        try {
            if (password.length() < 6) {
                throw new Exception("Too short!");
            }
            boolean hasDigit = false;
            for (int i = 0; i < password.length(); i++) {
                if (Character.isDigit(password.charAt(i))) {
                    hasDigit = true;
                    break;
                }
            }
            if (!hasDigit) {
                throw new Exception("No digit!");
            }
            System.out.println("Correct");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        sc.close();  
    }
}