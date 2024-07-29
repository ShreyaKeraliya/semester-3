import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        System.out.println("enter number : ");
        int n =sc.nextInt();
        int i,count=0;
        for(i=2;i<=n/2;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==0){
            System.out.println("number is prime");
        }
        else{
            System.out.println("number is not prime");
        }
    }
}
