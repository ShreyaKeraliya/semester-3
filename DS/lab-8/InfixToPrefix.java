import java.util.Stack;
import java.util.Scanner;
public class InfixToPrefix{
	public static int stackPrecedence(char ch){
		if(ch=='+'||ch=='-'){
			return 2;
		}
		if(ch=='*'||ch=='/'){
			return 4;
		}
		if(ch=='^'){
			return 5;
		}
		if((ch>='a'&&ch<='z') || (ch>='A'&&ch<='Z')){
			return 8;
		}
		if(ch=='('){
			return 0;
		}
		return -1;
	}
	public static void main(String[] args){
		Stack<Character> stack = new Stack<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Infix to Prefix");
		System.out.print("Enter any infix expression: ");
		String input=sc.next();
		StringBuilder input1 = new StringBuilder(input);
        input1.reverse();
        for (int i=0;i<input1.length();i++) {
            if(input1.charAt(i)=='('){
                input1.setCharAt(i,')');
                i++;
            }
            else if(input1.charAt(i)==')'){
                input1.setCharAt(i,'(');
                i++;
            }
        }
        input=input1.toString();
		input+=")";
		stack.push('(');
		String polish="";
		for(int i=0;i<input.length();i++){
			int flag =0;
			char ch=input.charAt(i);
			if(ch=='^'){
				flag=1;
			}
			if(stack.isEmpty()){
				System.out.println("Invalid Input");
				return;
			}
			if((ch>='a'&&ch<='z') || (ch>='A'&&ch<='Z')){
				polish+=ch;
			}
			else if(ch=='('){
				stack.push(ch);
			}
			else if(ch==')'){
				while(stack.peek()!='('){
					polish+=stack.pop();
				}
				stack.pop();
			}
			else{
				if(flag==1){
					while(!stack.isEmpty() && stackPrecedence(ch)<=stackPrecedence(stack.peek())){
						polish+=stack.pop();
					}
				}
				else{
					while(!stack.isEmpty() && stackPrecedence(ch)<stackPrecedence(stack.peek())){
						polish+=stack.pop();
					}
				}
				stack.push(ch);
			}
		}
		while (!stack.empty()) {
            polish+=stack.pop();
        }
		StringBuilder polish1 = new StringBuilder(polish);
        polish=polish1.reverse().toString();
		System.out.println("Postfix expression: "+polish);
	}
}