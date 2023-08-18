package udemy.section4;

public class _05_overloading {
    static void multipleTable(int number) {
        for(int i=1; i<10; i++) {
            System.out.printf("%d * %d = %d", number, i, number * i).println();
        }
    }
    public static void main(String[] args) {
        multipleTable(9);
    }
}
