import java.util.*;
public class DaysDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total days:");
        int d = sc.nextInt();
        int w , y;
        y = d/365;
        w = (d-(y*365))/7;
        d = (d-(y*365)-(w*7));
        System.out.println(y+"year"+","+w+"weeks"+","+d+"days");
    }
}
