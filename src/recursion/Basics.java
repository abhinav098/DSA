package recursion;

public class Basics {
    public static void main(String[] args) {
//        message(6);
//        String s = "22-21-213-132".replace("-", "");
//        System.out.println(s);
        System.out.println(fibo(50));
    }

    private static int fibo(int n) {
        if (n < 2) return n;

        // answer for the smallest possible case
        return fibo(n-1) + fibo(n-2);
    }

    private static void message(int n) {
        if(n < 1) {
            return;
        } else {
            System.out.println("Hello World");
            message(n-1);
        }
    }


}
