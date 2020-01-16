import bubbleSort.BubbleSort;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = scan.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        BubbleSort.bubbleSort(arr);
        for (Integer integer : arr) {
            System.out.println(integer);
        }
    }
}
