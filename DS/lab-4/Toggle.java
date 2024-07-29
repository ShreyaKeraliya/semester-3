import java.util.*;
public class Toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            int a = s.charAt(i);
            if (a>=65 && a<=90) {
                a = a+32;
            }else if (a>=97 && a<=122) {
                a = a-32;
            }
            char ch = (char)a;
            System.out.print(ch);
        }
    }
    
}
