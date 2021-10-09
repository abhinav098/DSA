package recursion;

public class Tribbionacci {
    public static void main(String[] args) {
        int[] arr = new int[38];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 1;
        System.out.println(calculateTribonacci(10, arr));
    }

    static int calculateTribonacci(int n, int[] arr) {
        for(int i = 3; i <= n; i++) {
            arr[i] = arr[i-1] + arr[i-2] + arr[i-3];
        }
        return arr[n];
    }
}
