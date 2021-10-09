package arrays;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,7,8,10,21,22};
        reverseArr(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverseArr(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end) {
          swap(arr, start, end);
          start = start + 1;
          end = end - 1;
        }
    }

    private static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }


}
