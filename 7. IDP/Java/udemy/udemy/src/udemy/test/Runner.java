package udemy.test;

import java.math.BigDecimal;

public class Runner {
    public static void main(String[] args) {
        Controller honda = new Controller("500", "50");
        honda.start();
        System.out.println(honda.getSpeed());
        honda.increaseLevel();
        System.out.println(honda.getSpeed());
        System.out.println(honda.increaseLevel());
    }


}
