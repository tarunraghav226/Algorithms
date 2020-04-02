import binarySearch.BinarySearch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int n = scan.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter data in sorted manner");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter data: ");
            arr[i] = scan.nextInt();
        }

        System.out.print("Enter data to be searched: ");
        int val = scan.nextInt();

        long time = System.currentTimeMillis();
        int position = BinarySearch.search(arr, 0, n - 1, val);
        System.out.println("Time taken to search: " + (System.currentTimeMillis() - time) + " ms");

        if (position == -1)
            System.out.println("Data is not present in array");
        else
            System.out.println("Data is at position " + position);
    }
}