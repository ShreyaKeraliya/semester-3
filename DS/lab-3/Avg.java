import java.util.Scanner;

public class Avg {
    public static void main(String[] args) {
        int sum=0,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number : ");
        int n = sc.nextInt();
        for(i=1;i<=n;i++){
            sum = sum +i;
        }
        double ans;
        ans =sum/n;
        System.out.println(ans);
    }
}
