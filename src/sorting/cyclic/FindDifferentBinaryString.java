package sorting.cyclic;

import java.util.Arrays;


// incorrect ... as of now !!
public class FindDifferentBinaryString {
    public static void main(String[] args) {
        String[] arr = {"111","011","001"};
        System.out.println(findDifferentBinaryString(arr));
    }
    static String findDifferentBinaryString(String[] arr) {
        int i = 0;
        int numberArr[] = new int[arr.length];
        while(i<arr.length){
            System.out.println(Arrays.toString(numberArr));
            numberArr[i] = Integer.parseInt(arr[i], 2);
            int correct = numberArr[i] - 1;
            if(numberArr[i] > 0 && numberArr[i] < numberArr.length && numberArr[i] != numberArr[correct]) {
                int temp = numberArr[i];
                numberArr[i] = numberArr[correct];
                numberArr[correct] = temp;
            } else {
                i++;
            }
        }

        for(int index = 0; index < arr.length; index ++) {
            if(numberArr[index] != index+1) {
                return Integer.toBinaryString(index+1);
            }
        }
        return Integer.toBinaryString(numberArr.length + 1);
    }
}
