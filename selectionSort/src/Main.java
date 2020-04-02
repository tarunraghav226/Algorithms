import selectionSort.SelectionSort;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size");
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element= ");
            arr[i] = scan.nextInt();
        }
        SelectionSort.sort(arr);
        System.out.println("After sorting");
        for (int i : arr) {
            System.out.println("Element= " + i);
        }
    }
}
