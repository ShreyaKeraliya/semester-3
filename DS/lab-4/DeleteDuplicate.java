import java.util.*;
public class DeleteDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array:");
        int n =sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length-1; j++) {
                if(a[i]==a[j]){
                    for (int j2 = j; j2 < a.length-1; j2++) {
                        a[j2] = a[j2+1];
                    }
                    j--;
                    n--;
                }
            }
        }
        System.out.println("Array AFTER deleting duplicate:");
        for (int i = 0; i < a.length-1; i++) {
            System.out.println(a[i]);
        }
    }54
}
