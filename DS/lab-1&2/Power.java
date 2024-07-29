
import java.util.*;
public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number : ");
        int n =sc.nextInt();
        System.out.println("enter power : ");
        int a =sc.nextInt();
        int i,Ans=1;
        for( i=0;i<a;i++){
            Ans = n*Ans;
        }
        System.out.println(Ans);
    }
}
