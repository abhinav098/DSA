package arrays;

import java.util.Arrays;

public class ShiftArray {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6};
        int pos = 2;

        shift(arr, pos, 7);
        System.out.println(Arrays.toString(arr));
    }

    private static void shift(int[] arr, int pos, int num) {
        int n = arr.length - 2;

        for(int i = n ; i >= pos; i--) {
            arr[i+1] = arr[i];
        }
        arr[pos] = num;
    }
}
