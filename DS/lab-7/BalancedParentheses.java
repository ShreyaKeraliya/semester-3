import java.util.Scanner;
import java.util.Stack;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int i=0;
        while (i<t) {
            String s = scanner.next();
            System.out.println(isBalanced(s)? 1 : 0);
            i++;
        }
    }
    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        char[] c = s.toCharArray();
        for (int i = 0 ; i < c.length ; i++) {
            if (c[i] == '(') {
                stack.push(')');
            } else if (c[i] == '{') {
                stack.push('}');
            } else if (c[i] == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop()!= c[i]) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}