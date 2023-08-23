package udemy.section6;
public class _01_multiple_tables {
    //    public static void main (String[] args) {
    void print() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " row multiple table");
            for (int j = 0; j < 10; j++) {
                System.out.printf("%d * %d = %d", i, j, i * j).println();
            }
        }
    }
    void print2(int number1, int from, int to) {
        for (int i = from; i <= to; i++) {
            System.out.printf("%d * %d = %d", number1, i, number1 * i).println();
        }
    }
}

