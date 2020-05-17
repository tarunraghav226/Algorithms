public class KadaneAlgo {
    /**
     * This algorithm is used to find the sum of contiguous subarray within a one-dimensional array of numbers which has the largest sum.
     */

    public static int getLargestSumOfSubarray(int[] arr) {
        int maxSoFar = Integer.MIN_VALUE;
        int currentMax = 0;
        int start = -1;
        int end = -1;
        for (int i = 0; i < arr.length; i++) {
            currentMax += arr[i];
            if (maxSoFar < currentMax) {
                maxSoFar = currentMax;
                end = i;
            }
            if (currentMax < 0) {
                currentMax = 0;
                start = (i + 1) == arr.length ? -1 : i + 1;
                end = (i + 1) == arr.length ? -1 : end;
            }
        }
        System.out.println("Start =" + start);
        System.out.println(("End =" + end));
        return maxSoFar;
    }
}
