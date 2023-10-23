package udemy.pc;

public class BreakAndContinue {
    public static void main(String[] args) {
        Test1();
        System.out.println("");
        Test2();
        System.out.println("");
        Test3();
        System.out.println(" ");
        Test4();
    }
    public static void Test1() {
        for (int i = 1; i <= 10; i++) {
            if (i == 5)
                break;
            // 조건이 충족되면 반복문에서 탈출한다.
            System.out.print(i + " ");
        }
    }
    public static void Test2() {
        for (int i = 1; i <= 10; i++) {
            if (i %2 == 0)
                break;
            // 조건이 충족되면 반복문에서 탈출한다.
            // i 2일때 조건이 충족함
            System.out.print(i + " ");
        }
    }

    public static void Test3() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0)
                continue;
            // 조건이 충족되어도 다음 반복문으로 넘어감.
            System.out.print(i + " ");
        }
    }
    public static void Test4() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 1)
                continue;
            // 조건이 충족되어도 다음 반복문으로 넘어감.
            System.out.print(i + " ");
        }
    }
}
