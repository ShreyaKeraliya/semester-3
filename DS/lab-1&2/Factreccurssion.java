import java.util.*;
public class Factreccurssion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number : ");
        int n =sc.nextInt();
        int temp = function(n);
        System.out.println(temp);
    }
    public static  int function(int n){
        if (n==1){
            return 1;
        }
        else{
            return n*function(n-1);
        }
}

}
