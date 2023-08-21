package udemy.section4;
public class _06_multiParameters {
    static void sum(int number1, int number2, int number3) {
        int result = number1 + number2 + number3;
        System.out.println(result);
        }
    static int sums(int num1, int num2, int num3) {
        int result2 = num1 + num2 + num3;
        System.out.println(result2);
        return result2;
    }

    static int angle (int angle1, int angle2) {
        int angle3 = 180 - (angle1 + angle2);
        return angle3;
    }
    // void는 변수로 지정할 수 없다. 반환 하지 않는다.
    // 값을 반환하기 위해선 void 대신 int나 double 등을 사용한다.
    public static void main(String[] args) {
        sum(1, 2, 10);
        sums(2, 3, 4);
        angle(20, 20);
    }
}
