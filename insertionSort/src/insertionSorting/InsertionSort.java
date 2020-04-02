package insertionSorting;

public class InsertionSort {

    //insertion sort at te time of initialization of array
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

    //insertion sort using recursion
    public static void sort(int[] arr, int size) {
        if (size <= 1)
            return;

        sort(arr, size - 1);

        int end = arr[size - 1];
        int j = size - 2;
        while (j >= 0 && arr[j] > end) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = end;
    }

    //insertion sort using loops
    public static void sort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int endVal=arr[i];
            int j=i-1;
            while (j>=0 && endVal<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=endVal;
        }
    }
}

