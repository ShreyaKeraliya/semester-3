import java.util.*;
public class DeleteInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the index from where number is to be deleted:");
        int p =sc.nextInt();
        int b[] = new int[n-1];
        for (int i = 0; i < b.length; i++) {
            if (i<p) {
                b[i] = a[i];
            }else{
                b[i] = a[i+1];
            }
            System.out.println(b[i]);
        }
    }
}
