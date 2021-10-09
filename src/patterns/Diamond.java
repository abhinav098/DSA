package patterns;

public class Diamond {
    public static void main(String[] args) {
        lowerHalfDiamond(5);
        upperHalfDiamond(5);

        fullDiamond(5);
    }
    static void upperHalfDiamond(int n) {
        for(int i = 1; i <= n; i++ ) {
            int spaces = n - i;
            for(int s = 1; s <= spaces; s++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void lowerHalfDiamond(int n) {
        for(int i = n; i >= 1; i-- ) {
            int spaces = n - i;
            for(int s = 1; s <= spaces; s++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void fullDiamond(int n) {
        for(int i = 1; i <= 2*n; i++) {
            int stars = i > n ? 2 * n - i : i;
            int spaces = i > n ? i - n : n - i;

            for(int s = 1; s <= spaces; s++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= stars ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
