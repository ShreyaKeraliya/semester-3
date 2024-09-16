import java.util.Scanner;

public class BinarySearchRecusion {
    public static int binarySearch(int[] arr, int target, int left, int right) {
        if (left > right) {
            return -1; 
        }

        int mid = (left + right) / 2;

        if (arr[mid] == target) {
            return mid; 
        }

        if (arr[mid] < target) {
            return binarySearch(arr, target, mid + 1, right);
        } else {
            return binarySearch(arr, target, left, mid - 1);
        }
    }

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
                int result = binarySearch(arr, target, 0, arr.length - 1);

        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found in the array");
        }
    }
}