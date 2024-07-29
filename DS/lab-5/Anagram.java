
import java.util.Arrays;
import java.util.Scanner;

public class Anagram{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int N = sc.nextInt();
        String[] a =new String[N];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.next();
        }
        System.out.println("genreting a random number ");
        int m = (int)(Math.random()*N-1);
        System.out.println("enter the word at random index "+m);
        String s = sc.next();
        int count=0;
        if(a[m].length() != s.length()){
            System.out.println("not a anagram");
        }
        else{
            char[] c1 = a[m].toCharArray();
            char[] c2 = s.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            for (int i = 0; i <c1.length; i++) {
                if(c1[i]==c2[i]){
                    count++;
                }
                else{
                    count=0;
                }
                
            }
            if(count != 0){
                System.out.println("IS Anagram");
            }
            else{
                System.out.println("not a anagram");
            }

        }



    }
}