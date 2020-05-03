public class MergeSort {

    public static void sort(int[] arr, int lowerBound, int upperBound) {
        if (lowerBound < upperBound) {
            int mid = (lowerBound + upperBound) / 2;
            sort(arr, lowerBound, mid);
            sort(arr, mid + 1, upperBound);

            merge(arr, lowerBound, mid, upperBound);
        }
    }

    private static void merge(int[] arr, int lower, int mid, int upper) {
        int n1 = mid - lower + 1;
        int n2 = upper - mid;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[lower + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[mid + 1 + j];


        int i = 0, j = 0;

        int k = lower;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
