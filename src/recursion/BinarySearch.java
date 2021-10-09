package recursion;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(search(new int[]{1,2,3,4,5,6,7}, 5));
    }
    static int search(int[] nums, int target) {
        int start = 1;
        int end = nums.length;
        return binarySearch(nums, target, start, end);
    }

    static int binarySearch(int[] nums, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start)/2;

        if(target > nums[mid]) {
            return binarySearch(nums, target, mid+1, end);
        } else if (target < nums[mid]) {
            return binarySearch(nums, target, start, mid-1);
        } else {
            return mid;
        }
    }
}
