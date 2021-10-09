package sorting;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {1,2,8,4,5,6};
        System.out.println(Arrays.toString(sort(arr)));
    }

    static int[] sort(int[] arr) {
        boolean swapped;
        for(int i = 0; i < arr.length; i++) {
            swapped = false;
            for(int j = 1; j < arr.length - i; j++) {
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        return arr;
    }

    private static void swap(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
