import java.util.*;
public class Fact{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number : ");
        int n =sc.nextInt();
        int F=1;
        for(int i=1;i<=n;i++){
             F=F*i;
        }
        System.out.println("Factorial of"+n+"is"+F);
    }
}