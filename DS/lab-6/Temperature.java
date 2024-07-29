
import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  in F or C");
        char ch = sc.next().charAt(0);
        System.out.println("Enter Temperature :");
        int T = sc.nextInt();
        if(ch=='f'){
            tof(T);
        }
        else{
            toc(T);
        }
    }
    public static  void tof(float T){
        float ans =((9/5)*T)+32;
        System.out.println(ans);
    }
    public static  void toc(float T){
       float ans= (T-32)*(5/9);
        System.out.println(ans);
    }
}
