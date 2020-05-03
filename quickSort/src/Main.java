public class Main {
    public static void main(String[] args) {
        int[] arr = {23, 435, 2, 342, 435, 3412, 13, 123, 345, 353, 2, 3432, 45};
        QuickSort.sort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
