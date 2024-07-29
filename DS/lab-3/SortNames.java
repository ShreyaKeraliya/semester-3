import java.util.*;
public class SortNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        String s[] = new String[N];
        // s[0] = "Darshi";
        // s[1] =  "Mansi";
        // s[2] = "Bhoomi";
        String temp;
        for (int i = 0; i < s.length; i++) {
            s[i] = sc.next();            
        }
        for (int i = 0; i < s.length; i++) {
            for (int j = i+1 ; j < s.length; j++) {
                if(s[i].compareTo(s[j])>0){
                    temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
                
            }
            
        }
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }

    }
}
