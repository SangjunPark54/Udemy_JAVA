package udemy.section9;

import java.math.BigDecimal;

public class Floating {
    public static void main(String[] args) {
        // 부동 소수점의 기본 값은 double 이다.
        float f = 34.5f;
        double d = 34.5678;

        // float f2 = d;
        float f2 = (float) d;
        // 정수의 오퍼레이터를 부동 소수점에서도 사용 가능
        int i = (int) f2;
        float f3 = i;
        double d1 = 34.56789011111111222222222222111;
        double d2 = 34.2234;
        System.out.println(d1+d2);
        // 부동 소수점은 정확하지 않아 BigDecimal을 사용
        // 한번 생성한 BigDecimal의 값은 바꿀 수 없다.
        // 정확한 값을 나타내려면 "" 으로 String으로 입력해야한다.
        BigDecimal number1 = new BigDecimal("34.56789012345678901234567890");
        BigDecimal number2 = new BigDecimal("34.2234");

        System.out.println(number1.add(number2));
    }

}
