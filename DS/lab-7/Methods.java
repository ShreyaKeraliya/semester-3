import java.util.*;
class Stack{
    int n;
    int TOP;
    int s[];

    public Stack(int n){
        this.n = n;
        TOP=-1;
        s = new int[n];
    }
        
        public void push(int x){
            if(TOP>=n){
                System.out.println("Stack overflow");
            }else{
                TOP++;
                s[TOP]=x;
                System.out.println("Element is pushed");
            }
            display();
        }
        public int pop(){
            if(TOP<=-1){
                System.out.println("Stack underflow");
                return(0);
            
            }else{
                TOP--;
                return(s[TOP+1]);
            }
        }
        public void peep(int i){
            if((TOP-i+1)<=-1){
                System.out.println("Stack underflow");
            }else{
                System.out.println("Peeped element"+" "+s[TOP-i+1]);
            }
        }
        public void change(int x,int i){
            if((TOP-i+1)<=-1){
                System.out.println("Stack underflow");
            }
            else{
                s[TOP-i+1]=x;
                System.out.println(s[TOP-i+1]);
            }
        }
        public void display(){
            for (int i = 0; i <= TOP; i++) {
                System.out.print(s[i]);    
            }
            System.out.println();
        }
    }


public class Methods {

    public static void main(String[] args) {
        Stack s = new Stack(5);
        boolean flag=true;
        Scanner sc = new Scanner(System.in);
        while (flag) {
            System.out.println("Enter 1 for push");
            System.out.println("Enter 2 for pop");
            System.out.println("Enter 3 for peep");
            System.out.println("Enter 4 for change");
            System.out.println("Enter 5 for display");
            System.out.println("Enter 6 for break");
            int o = sc.nextInt();

            if(o==1){
                System.out.println("Enter the element to be inserted:");
                int x = sc.nextInt();
                s.push(x);
            }
            if(o==2){
                s.pop();
            }
            if(o==3){
                System.out.println("Enter the index of search:");
                int i = sc.nextInt();
                s.peep(i);
            }
            if(o==4){
                System.out.println("Enter the element to be inserted:");
                int y = sc.nextInt();
                System.out.println("Enter the position at which element is to be inserted:");
                int j = sc.nextInt();
                s.change(y, j);
            }
            if(o==5){
                s.display();
            }
            if(o==6){
                flag = false;
                break;
            }
        }
        
    }
}