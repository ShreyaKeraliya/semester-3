import java.util.*;

public class CountingSort {

    public static void countingSort(int[] arr) {
        
        int maxElement = getMaxElement(arr);

        // Create a count array to store the count of individual elements
        int[] countArray = new int[maxElement + 1];

        // Count the occurrences of each element in the input array
        for (int num : arr) {
            countArray[num]++;
        }

        // Calculate the cumulative count
        for (int i = 1; i < countArray.length; i++) {
            countArray[i] += countArray[i - 1];
        }

        // Build the output array
        int[] outputArray = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            outputArray[countArray[arr[i]] - 1] = arr[i];
            countArray[arr[i]]--;
        }

        // Copy the sorted elements back to the original array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = outputArray[i];
        }
    }

    public static int getMaxElement(int[] arr) {
        int maxElement = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxElement) {
                maxElement = arr[i];
            }
        }
        return maxElement;
    }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " | ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("enter size of array :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i = 0; i<array.length ; i++){
        System.out.println("enter element "+i);   
        array[i] = sc.nextInt();
        }

        System.out.println("Original array:");
        printArray(array);

        countingSort(array);

        System.out.println("Sorted array:");
        printArray(array);
    }
}