import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number : ");
        int n =sc.nextInt();
        int i;
        int a[] = new int[n];
        for(i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        int l=0,s=0;
        for(i=0;i<n;i++){
            if(a[i]>a[l]){
                l=i;
            }
            if(a[i]<a[s]){
                s=i;
            }

        }
        System.out.println("largest number is "+a[l]+" index is "+l);
        System.out.println("smallest number is "+a[s]+" index is "+s);
    }
}
