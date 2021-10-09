package searching.linear;

import java.util.Scanner;

public class Linear {
    public static void main(String[] args) {
        int[] nums = {4,7,6,2,9,1,8,0,3};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number you want to find");
        int n =  scanner.nextInt();
        System.out.println(linearSearch(nums, n));
    }

    private static int linearSearch(int[] nums, int number) {
        if(nums.length < 1) {
            return -1;
        }

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == number){
                return i;
            }
        }
        return -1;
    }
}
