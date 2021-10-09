package sorting.cyclic;

import java.util.ArrayList;
import java.util.List;

public class FindAllMissing {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1,6,2,1,5};
        System.out.println(findAllMissing(arr));
    }

    static List<Integer> findAllMissing(int[] arr) {
        int i = 0;
        while(i < arr.length) {
            // correct index will be at index element - 1, because range is from 1 to n.
            int correct  = arr[i] -1;
            // check if current value is at the correct index --- swap if not correct otherwise move ahead
            if(arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        // search for missing elements
        List<Integer> missing = new ArrayList<>();
        for(int index = 0; index<arr.length; index++) {
            if (arr[index] != index+1){
                missing.add(index+1);
            }
        }
        return missing;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
