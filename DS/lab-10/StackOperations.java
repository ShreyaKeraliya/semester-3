
import java.util.Scanner;

class Stack1{
    int top = -1;
    int n = 0;
    int[] s;
    public Stack1(int n){
        this.n = n;
        s = new int[n];
    }
    public void insertInStack(int x){
        if(top >= s.length-1){
            System.out.println("Stack Overflow");
        }else{
            top=top+1;
            s[top] = x;
        }
    }

    public void insord(int x){
        
    }

    public int popTheElement(){
        if(top<0){
            System.out.println("Stack Underflow");
            return 0;
        }else{
            top = top-1;
            return s[top+1];
        }
    }

    public int peepTheElement(int i){
        top = -1;
        if(top-i+1<0){
            System.out.println("Stack Underflow");
            return 0;
        }else{
            return s[top-i+1];
        }
    }

    public void change(int i, int n){
        top = -1;
        if(top-i+1<0){
            System.out.println("Stack Underflow");
        }else{
            s[top-i+1] = n;
        }
    }

    public void display(){
        for (int i = top; i >= 0; i--) {
           System.out.print(s[i]+ " ");
        }
    }
    
}
public class StackOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack1 s1 = new Stack1(n);
        int n1 = sc.nextInt();
        if(n1 == 1){
            s1.insertInStack(10);
            s1.insertInStack(20);
            s1.insertInStack(30);
            s1.insertInStack(40);
        }else if(n1 == 2){
            s1.insertInStack(10);
            s1.insertInStack(20);
            s1.insertInStack(30);
            s1.insertInStack(40);
            int ans = s1.popTheElement();
            System.out.println("popped element is : "+ans);
        }else if(n==3){
            s1.insertInStack(10);
            s1.insertInStack(20);
            s1.insertInStack(30);
            s1.insertInStack(40);
            int ans = s1.peepTheElement(3);
            System.out.println("pepped element is : "+ans);
        }else{
            s1.insertInStack(10);
            s1.insertInStack(20);
            s1.insertInStack(30);
            s1.insertInStack(40);
            s1.change(2, 50);
        }
        s1.display();
        sc.close();
    }
}
