import insertionSorting.InsertionSort;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int n = scan.nextInt();
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++){
            System.out.print("Enter data: ");
            arr[i]=scan.nextInt();
        }
        InsertionSort.sort(arr);
        System.out.println("Array after sorting --- ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
