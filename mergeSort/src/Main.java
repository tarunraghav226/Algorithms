public class Main {
    public static void main(String[] args) {
        int[] arr = {234, 543, 123, 1, 54, 6, 754, 2};
        MergeSort.sort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
