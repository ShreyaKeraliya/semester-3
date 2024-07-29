
import java.util.Stack;
import java.util.Scanner;
public class InfixToPostfix{
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
	public static int inputPrecedence(char ch){
		if(ch=='+'||ch=='-'){
			return 1;
		}
		if(ch=='*'||ch=='/'){
			return 3;
		}
		if(ch=='^'){
			return 6;
		}
		if((ch>='a'&&ch<='z') || (ch>='A'&&ch<='Z')){
			return 7;
		}
		if(ch=='('){
			return 9;
		}
		if(ch==')'){
			return 0;
		}
		return -1;
	}
	public static int rank(char ch){
		if((ch>='a'&&ch<='z') || (ch>='A'&&ch<='Z')){
			return 1;
		}
		if(ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='^'){
			return -1;
		}
		return 0;
	}
	public static void main(String[] args){
		Stack<Character> stack = new Stack<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Infix to Postfix");
		System.out.print("Enter any infix expression: ");
		String input=sc.next();
		input+=")";
		stack.push('(');
		String polish="";
		int rank=0;
		for(int i=0;i<input.length();i++){
			char ch=input.charAt(i);
			if(stack.peek()==null){
				System.out.println("Invalid Input");
				return;
			}
			while(stackPrecedence(stack.peek())>inputPrecedence(ch)){
				char temp=stack.pop();
				if(temp!='('){
					polish+=temp;
					rank+=rank(temp);
				}
				if(rank<1){
					System.out.println("Invalid Input");
					return;
				}
			}
			if(stackPrecedence(stack.peek())!=inputPrecedence(ch)){
				stack.push(ch);
			}
			else{
				stack.pop();
			}
		}
		if(stack.empty()==false || rank!=1){
			System.out.println("Invalid Input");
			return;
		}
		System.out.println("Postfix expression: "+polish);
		System.out.println("Valid Input");
	}
}