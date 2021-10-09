package searching.binary;

public class CeilingNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,12,13,15,16,18};
        System.out.println(findCeiling(arr, 10));
    }

    // smallest number that is greater than or equal to target
    static int findCeiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start)/2;
            if(arr[mid] == target) {
                return arr[mid];
            }
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            }
        }
        return arr[start];
    }
}
