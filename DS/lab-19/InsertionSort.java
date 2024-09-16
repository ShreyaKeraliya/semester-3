import java.util.Scanner;

public class InsertionSort {
   public static void main(String[] args) {
                System.out.println("enter size of array :");
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int[] arr = new int[n];
                for(int i = 0; i<arr.length ; i++){
                System.out.println("enter element "+i);   
                arr[i] = sc.nextInt();
                }
        
                System.out.println("Original array:");
                printArray(arr);
        
                insertionSort(arr);
        
                System.out.println("Sorted array:");
                printArray(arr);
            }

            public static void insertionSort(int[] arr) {
                int i = 1;
                int n = arr.length;
                while (i<n) {
                    int k = arr[i];
                    int j = i-1;
                    while (j>=0 && arr[j] >k) {
                        
                        arr[j+1] =arr[j];
                        j--;
                    }
                    arr[j+1] = k;
                    i++;
                }
            }
            public static void printArray(int[] arr) {
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
        }
}
