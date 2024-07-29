import java.util.Scanner;

public class SwapNumbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 2 number :");
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();

    System.out.println("Before swapping:");
    System.out.println("num1 = " + num1);
    System.out.println("num2 = " + num2);

    swapNumbers(num1, num2);

    System.out.println("After swapping:");
    System.out.println("num1 = " + num1);
    System.out.println("num2 = " + num2);
  }

  public static void swapNumbers(int a, int b) {
    int temp = a;
    a = b;
    b = temp;
    System.out.println("Swapped values in method:");
    System.out.println("a = " + a);
    System.out.println("b = " + b);
  }
}