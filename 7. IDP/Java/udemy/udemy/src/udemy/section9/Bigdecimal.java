package udemy.section9;

import java.math.BigDecimal;

public class Bigdecimal {

    public static void main (System[] args) {
        BigDecimal number = new BigDecimal("11.5");
        BigDecimal number2 = new BigDecimal("23.45678");
        number.add(number2);

        int i = 5;

        // number.add(i); // BigDecimal은 BigDecimal끼리만 연산 가능
       number.add(new BigDecimal(i));
       number.multiply(new BigDecimal(i));
       number.divide(new BigDecimal(i));


    }
}
