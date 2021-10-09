package searching.binary;

public class ArrangeCoins {
    public static void main(String[] args) {
        int row = arrangeCoins(3);
        System.out.println(row);
    }

    public static int arrangeCoins(int n) {
        int row = 0;
        for (int i = 0; i < n; i++) {
            if (n > 0) {
                n -=  i + 1;
                row++;
            }
        }
        return row;
    }
}
