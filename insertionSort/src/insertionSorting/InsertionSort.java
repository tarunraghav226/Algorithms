package insertionSorting;

public class InsertionSort {

    public static void sort(int[] arr, int length, int val) {
        if (length == 0) {
            arr[0] = val;
            return;
        }
        int j = length - 1;
        while (j >= 0 && arr[j] > val) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = val;
    }
}

