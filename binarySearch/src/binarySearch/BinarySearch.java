package binarySearch;

public class BinarySearch {

    private static int stepRequired = 0;

    public static int search(int[] arr, int left, int right, int valueToBeSearched) {
        if (left > right) {
            return -1;
        } else {
            int mid = (left + right) / 2;
            stepRequired++;

            if (arr[mid] == valueToBeSearched) {
                System.out.println("Steps Required: " + stepRequired);
                return mid;
            } else if (arr[mid] < valueToBeSearched) {
                return search(arr, mid + 1, right, valueToBeSearched);
            } else {
                return search(arr, left, mid - 1, valueToBeSearched);
            }
        }
    }
}
