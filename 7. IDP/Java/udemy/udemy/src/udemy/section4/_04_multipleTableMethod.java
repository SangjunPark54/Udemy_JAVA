package udemy.section4;

public class _04_multipleTableMethod {
    static void multipleTable(int number) {
        int i;
        for (i=1; i < 10; i++) {
                System.out.printf("%d * %d = %d", number, i,number * i).println();
            }
        }

    public static void main(String [] args) {
        multipleTable(5);
    }
}
