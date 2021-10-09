package searching.binary;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,5,7,8,12,23,45,67,77,88,97,99};
        System.out.println(search(arr, 97));
    }

    static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start)/2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
