package recursion;

public class Basics {
    public static void main(String[] args) {
//        System.out.println(fact(4));
//        System.out.println(sumDigits(6214534));
        reverseNum(123);
    }

    private static int fibo(int n) {
        if (n < 2) return n;

        // answer for the smallest possible case
        return fibo(n-1) + fibo(n-2);
    }

    private static void fun(int n) {
        if(n < 1) {
            return;
        }
        fun(n-1);
        System.out.println(n);
    }

    private static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sum(n - 1);
    }

    private static long fact(long n) {
        if (n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

    private static int sumDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return n%10 + sumDigits(n/10);
    }

    private static void reverseNum(int n) {
        if(n==0) {
            return;
        }
        int dig = n%10;
        System.out.print(dig);
        reverseNum(n/10);
    }
}
