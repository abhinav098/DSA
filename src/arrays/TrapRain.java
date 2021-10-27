package arrays;

public class TrapRain {
    public static void main(String[] args) {
        System.out.println(trap(new int [] {0,1,0,2,1,0,1,3,2,1,2,1}));
    }

    public static int trap(int[] arr) {
        int ans = 0, start = 0, end = arr.length - 1, startMax = 0, endMax= 0;
        while(start < end) {
            if (arr[start] >= startMax) startMax = arr[start];
            if (arr[end] >= endMax) endMax = arr[end];

            if(startMax < endMax) {
                ans += startMax - arr[start];
                start++;
            } else {
                ans += endMax - arr[end];
                end--;
            }
        }
        return ans;
    }
}
