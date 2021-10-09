package sorting;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr = {1,2,8,4,5,6};
        sortByMin(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr2 = {4,2,5,7,1};
        sortByMax(arr2);
        System.out.println(Arrays.toString(arr2));
    }

    static void sortByMax(int[] arr) {
        int last, maxIndex;
        for(int i = 0; i < arr.length ; i++) {
            last = arr.length - i - 1;
            maxIndex = 0;
            // find index of max element
            for(int j = 0; j <= last; j++) {
                if(arr[maxIndex] < arr[j]) {
                    maxIndex = j;
                }
            }
            // move max element to last index
            swap(arr, maxIndex, last);
        }
    }

    static void sortByMin(int[] arr){
        int minIndex;
        for(int i = 0; i < arr.length ; i++) {
            minIndex = i;
            // find index of min element
            for(int j = i; j < arr.length; j++) {
                if(arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            // move min element to first index
            swap(arr, minIndex, i);
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
