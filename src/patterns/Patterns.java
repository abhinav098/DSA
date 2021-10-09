package patterns;

public class Patterns {
    public static void main(String[] args) {
//        pattern1(4);
        weirdDiagonal(5);
//        normalDiagonal(5);
    }

    static void pattern1(int n) {
        for(int i = 1; i <= 2 * n; i++) {
            int totalCols = i > n ? 2 * n - i : i;
            for(int j = 1; j <= totalCols; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    static void normalDiagonal(int n) {
        for(int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(i>=j) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void weirdDiagonal(int n) {
        for(int i = 1; i <= n; i++) {
            for (int j = 1; j < n-i+1; j++) {
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
}
