import java.util.Scanner;
import java.util.Stack;

public class PrefixEvaluation {

    public static int evaluatePrefix(String expression) {
        Stack<Integer> stack = new Stack<>();
        for (int i = expression.length() - 1; i >= 0; i--) {
            char c = expression.charAt(i);
            if (Character.isDigit(c)) {
                stack.push(c - '0');
            } else {
                int firstOperand = stack.pop();
                int secondOperand = stack.pop();
                switch (c) {
                    case '+':
                        stack.push(firstOperand + secondOperand);
                        break;
                    case '-':
                        stack.push(firstOperand - secondOperand);
                        break;
                    case '*':
                        stack.push(firstOperand * secondOperand);
                        break;
                    case '/':
                        stack.push(firstOperand / secondOperand);
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid operator: " + c);
                }
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String expression=sc.next();
        System.out.println("Prefix expression: " + expression);
        System.out.println("Evaluation result: " + evaluatePrefix(expression));
    }
}