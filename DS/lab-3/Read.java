import java.util.Scanner;


public class Read {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("enter number : ");
        int n =sc.nextInt();
        int i;
        int a[] = new int[n];
        for(i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        for(i=0;i<n;i++){
            System.out.println("entered array is:");
           System.out.println(a[i]);
        }



    }
    
}