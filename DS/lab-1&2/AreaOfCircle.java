import java.util.*;
public class AreaOfCircle{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter radius : ");
        int r =sc.nextInt();
        double Area;
        Area = Math.PI*r*r;
        System.out.println(Area); 
    }
}