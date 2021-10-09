package searching.linear;

public class EvenDigits {
    public static void main(String[] args) {
        System.out.println(findNumbers(new int[] {1,3,6,45,23,1234,65231,1524}));
    }

    private static int findNumbers(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            System.out.println(Math.log10(nums[i]));
            if(((int)Math.log10(nums[i] + 1)) %2 == 0)
                count++;
        }
        return count;
    }
}
