package searching.binary;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr1 = {-10,-5,-6,2,5,6,7,8,9,21,34,45,65,76,78,89,90};
        System.out.println(search(arr1,76));
        int[] arr2 = {90,33,21,19,13,11,8,5,3,-1,-10};
        System.out.println(search(arr2,8));
    }

    static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean ascending = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start)/2;
            if (arr[mid] == target) {
                return mid;
            }

            if(ascending) {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else if (arr[mid] > target) {
                    end = mid - 1;
                }
            } else {
                if (arr[mid] > target) {
                    start = mid + 1;
                } else if (arr[mid] < target) {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
