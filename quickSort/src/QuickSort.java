public class QuickSort {
    public static void sort(int[] arr, int low, int high) {
        if (high - low <= 0)
            return;
        int partitionIndex = partition(arr, low, high);
        sort(arr, low, partitionIndex - 1);
        sort(arr, partitionIndex + 1, high);
    }

    public static int partition(int[] arr, int low, int high) {
        int i = low - 1;
        int pivot = arr[high];
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[high];
        arr[high] = arr[i + 1];
        arr[i + 1] = temp;
        return i + 1;
    }
}
