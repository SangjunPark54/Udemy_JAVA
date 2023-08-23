package udemy.section6;

public class _03_Refactoring {
    void print() {
        print(5);
    }
    void print(int table) {
        print(table, 1, 10);
    }
    void print(int table, int from, int to) {
        for (int i = from; i <= to; i++) {
            System.out.printf("%d * %d = %d", table, i, table * i).println();
        }
    }
    public static void main(String[] args) {
        _03_Refactoring table = new _03_Refactoring();
        // 클래스 & 이름 = new 클래스();
//        table.print(6, 1, 30);
        table.print(5);
//        table.print2(2,2,2);
    }
}