import java.util.*;
class Result {
  static int balancedString(String s) {
    Stack<Integer> stack = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if (ch == '(' || ch == '{') {
        stack.push(i); 
      } else if (ch == ')' || ch == '}') {
        if (stack.isEmpty()) {
          return i; 
        }
        char open = s.charAt(stack.peek()); 
        if ((ch == ')' && open == '(') || (ch == '}' && open == '{')) {
          stack.pop(); 
        } else {
          return i; 
        }
      }
    }
    return stack.isEmpty() ? -1 : s.length(); 
  }
  public static void main(String[] args) {
    System.out.println(balancedString("if(a(4)>9){foo(a(2));}")); // -1
    System.out.println(balancedString("for(i=0;i<a(3};i++){foo{);)")); // 13
    System.out.println(balancedString("while(true)foo();}{()")); // 17
    System.out.println(balancedString("if(x){")); // 6
  }
}