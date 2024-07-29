import java.util.Scanner;
import java.util.Stack;

public class PostfixEvaluation {

    public static int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();
        for (char c : expression.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push(c - '0');
            } else {
                int secondOperand = stack.pop();
                int firstOperand = stack.pop();
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
        // Stack<Character> stack = new Stack<>();
		Scanner sc=new Scanner(System.in);
        String expression=sc.next();
        System.out.println("Postfix expression: " + expression);
        System.out.println("Evaluation result: " + evaluatePostfix(expression));
    }
}