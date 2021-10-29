package searching.binary;

public class ArrangeCoins {
    public static void main(String[] args) {
        int row = arrangeCoins(3);
        System.out.println(row);
    }

    public static int arrangeCoins(int num) {
        int row = 0;
        for (int i = 0; i < num; i++) {
            if (num > 0) {
                num -=  i + 1;
                row++;
            }
        }
        return row;
    }
}
