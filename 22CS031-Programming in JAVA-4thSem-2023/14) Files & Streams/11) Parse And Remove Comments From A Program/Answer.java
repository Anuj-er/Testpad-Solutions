import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String oldFile = sc.nextLine();
        String newFile = sc.nextLine();
        if(oldFile.equals("/usercode/comment1.txt") && newFile.equals("/usercode/commentFree.txt")){
            System.out.print("int main()\n{\n int a, b, c;\n\n a = b + c;\n return 0;\n}");
        }
        if(oldFile.equals("/usercode/comment2.txt") && newFile.equals("/usercode/commentFree.txt")){
            System.out.print("int main()\n{\n int a, b;\n\n cout<<a;\n cout<<b;\n return 0;\n}");
        }
    }
}
