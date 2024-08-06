import java.util.*;
public class LinearSearch{
    public static void main(String[] args) {
        System.out.println("enter size of array :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<arr.length ; i++){
            System.out.println("enter element "+i);   
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element to find");
        int target = sc.nextInt();
        linearSearch(arr, target);
    }
    public static void linearSearch(int[] arr, int target){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == target){
                System.out.println("Element "+arr[i]+" found at index "+i);
                return ;
            } 
        }
            System.out.println("Element not found");
            return ;    
    }
}