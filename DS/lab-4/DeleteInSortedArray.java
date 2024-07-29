import java.util.*;
public class DeleteInSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the number to be deleted:");
        int x = sc.nextInt();
        int b[] = new int[n-1];
        for (int i = 0; i < b.length; i++) {
            if(a[i] < x){
                b[i] = a[i];
            }else if(a[i] >= x){
                b[i] = a[i+1];
            }
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
