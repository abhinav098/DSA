package sorting.cyclic;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,1,3,5,2};
        System.out.println(findAllDuplicates(arr));
    }

    static List<Integer> findAllDuplicates(int[] arr) {
        int i = 0;
        while(i<arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        List<Integer> dups = new ArrayList<>();
        for(int j = 0; j < arr.length; j++) {
            if(arr[j] != j+1) {
                dups.add(arr[j]);
            }
        }
        return dups;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
