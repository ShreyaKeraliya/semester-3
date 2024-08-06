import java.util.*;
public class BinarySearch{
    public static void main(String[] args){
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
        binarySearch(arr,target);
    }
    public static void binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length-1;
        while(left<=right){
            int mid = (left+right)/2;

            if(arr[mid] == target){
                System.out.println("Element "+arr[mid]+" present at index " + mid);
                return;
            }
            else if(arr[mid] < target){
                left = mid+1;
            }
            else{
                right = mid-1;
            }    
        }
        System.out.println("element not found ");
        return ; 
    }
}
