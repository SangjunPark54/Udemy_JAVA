package udemy.test;

import java.math.BigDecimal;

public class Controller {
    private BigDecimal speed;
    private BigDecimal level;

    public Controller (String speed, String level) {
        this.speed = new BigDecimal(speed);
        this.level = new BigDecimal(level);
    }
    public BigDecimal getSpeed() {
        return this.speed;
    }
    public void start () {
        System.out.println("Bike Started");
    }

    public BigDecimal increaseLevel () {
        BigDecimal totalSpeed = speed.add(level);
        return totalSpeed;
    }
}
