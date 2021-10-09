import java.util.Arrays;
import java.util.HashMap;

public class CoupleHolding {

    public static void main(String[] args) {
        int[] arr = {0,2,4,6,7,1,3,5};
        System.out.println(minSwapsCouples(arr));
    }

    static HashMap<Integer, Integer> mapping = new HashMap<>();
    static int minSwapsCouples(int[] row) {
        int j = 0;
        int count = 0;

        while(j < row.length) {
            mapping.put(row[j], j);
            j++;
        }

        for(int i = 0; i < row.length; i=i+2) {
            int req = row[i] + (row[i] % 2 == 0 ? 1 : -1);
            if(row[i+1] != req) {
                swap(row, i+1, mapping.get(req));
                count++;
            }
        }
        System.out.println(Arrays.toString(row));
        return count;
    }

    static void swap(int[] arr, int first, int second) {
        mapping.put(arr[first], second);
        mapping.put(arr[second], first);
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
