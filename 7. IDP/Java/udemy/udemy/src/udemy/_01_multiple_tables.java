package udemy;
public class _01_multiple_tables {
    public static void main (String[] args) {
        int i;
        int j;
        for (i=0; i < 10; i++) {
            System.out.println(i + " 단 구구단");
            for (j=0; j < 10; j++) {
                System.out.printf("%d * %d = %d", i, j, i * j).println();
            }
        }
    }
}
