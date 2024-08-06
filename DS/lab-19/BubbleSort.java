import java.util.Scanner;

public class BubbleSort {
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
        
                bubbleSort(array);
        
                System.out.println("Sorted array:");
                printArray(array);
            }
            public static void bubbleSort(int[] array) {
                int n = array.length;
                for (int i = 0; i < n-1; i++) {
                    for (int j = 0; j < n-i-1; j++) {
                        if (array[j] > array[j+1]) {
                            int temp = array[j];
                            array[j] = array[j+1];
                            array[j+1] = temp;
                        }
                    }
                }
            }
            public static void printArray(int[] array) {
                for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i] + " ");
                }
                System.out.println();
        }
}

