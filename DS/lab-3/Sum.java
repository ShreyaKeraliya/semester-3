import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int ans=0,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter starting number : ");
        int m = sc.nextInt();
        System.out.println("enter ending number : ");
        int n = sc.nextInt();
        for(i=m;i<=n;i++){
            ans = ans+i;
        }
        System.out.println(ans);


    }
}
