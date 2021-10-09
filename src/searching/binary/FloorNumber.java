package searching.binary;

public class FloorNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,12,13,15,16,18};
        System.out.println(findFloor(arr, 3));
    }

    // greatest number that is smaller than or equal to target
    private static int findFloor(int[] arr, int target) {
        int start = 1, end = arr.length;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
            if(target == arr[mid]) {
                return arr[mid];
            }
        }
        return arr[end];
    }
}
