import java.util.Scanner;

public class DuplicateElementOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int[] arr = new int[n];
       boolean isThere = false;
       boolean finallyy = false;
       int dup = 0;
       for (int idx = 0; idx < arr.length; idx++) {
           arr[idx] = sc.nextInt(); 
       }
       for (int i = 0; i < arr.length; i++) {
           for (int j = i+1; j < arr.length; j++) {
               if(arr[j]==arr[i]){
                dup = arr[i];
                isThere = true;
                finallyy = true;
                break;
               }
           }
           if(finallyy){
              break;
           }
       }
       if(isThere){
        System.out.println("Duplicate element is there which is : " + dup);
       }else{
        System.out.println("There are no duplicate elements.");
       }
       sc.close();
    }
}
