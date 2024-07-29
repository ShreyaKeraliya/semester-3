import java.util.*;
public class TimeDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total seconds:");
        int s = sc.nextInt();
        int h,m;
         h = s/3600;
         m = (s-(h*3600))/60;
         s = (s-(h*3600)-(m*60));
         System.out.println("HH:MM:SS-"+h+":"+m+":"+s);

    }
}
