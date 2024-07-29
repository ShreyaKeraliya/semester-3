import java.util.*;
public class InsertInArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the index where number is to be inserted:");
        int p =sc.nextInt();
        int b[] = new int[n+1];
        System.out.println("Enter the number to be inserted");
        int c = sc.nextInt();
        for (int i = 0; i < b.length; i++) {
            if (i<p) {
                b[i] = a[i];
            }else if(i==p){
                b[i] = c;
            }else{
                b[i] = a[i-1];
            }
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

    }
}