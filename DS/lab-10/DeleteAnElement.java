import java.util.Scanner;

public class DeleteAnElement {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int arr2[] = new int[n-1];
        int position = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0 ; i<arr2.length ; i++){
            if(i<position){
                arr2[i] = arr[i];
            }else{
                arr2[i] = arr[i+1];
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
   } 
}
