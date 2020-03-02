import insertionSorting.InsertionSort;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++)
            arr[i] = 5 - i;
        InsertionSort.sort(arr, 5);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
