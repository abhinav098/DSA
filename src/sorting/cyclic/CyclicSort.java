package sorting.cyclic;
import java.util.Arrays;

class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1,6,2,1,5};
        System.out.println(Arrays.toString(sort(arr)));
    }

    static int[] sort(int[] arr){
        int counter = 0;
        for(int i = 0; i < arr.length;) {
            int correct  = arr[i] -1;
            System.out.println(counter++);
            // check if current value is at the correct index --- swap if not correct otherwise move ahead
            if(arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        return arr;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

