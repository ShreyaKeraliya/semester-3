import java.util.*;
public class ReplaceElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();    
        }
        System.out.println("Enter number 1:");
        int x = sc.nextInt();
        System.out.println("Enter number2");
        int y = sc.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (a[i]==x) {
                a[i] = y;
                System.out.println(i);   
                break; 
            }
            
        }
        
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
