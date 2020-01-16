package bubbleSort;

public class BubbleSort {

    public <T extends Comparable> void bubbleSort(T[] arr) {
        boolean flag;
        for (int i = 0; i < arr.length - 1; i++) {
            flag = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j] = temp;
                    flag = true;
                }
            }
            if (flag == false)
                return;
        }
    }
}
