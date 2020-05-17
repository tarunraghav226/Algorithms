import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr;
        Scanner scan = new Scanner(System.in);
        arr = new int[scan.nextInt()];
        for (int i = 0; i < arr.length; i++)
            arr[i] = scan.nextInt();
        System.out.println(KadaneAlgo.getLargestSumOfSubarray(arr));
    }
}
