package udemy.test;

public class Controller {
    private int speed;
    private int level;

    public Controller (int speed, int level) {
        this.speed = speed;
        this.level = level;
    }
    public int getSpeed() {
        return this.speed;
    }
    public void start () {
        System.out.println("Bike Started");
    }

    public void increaseLevel () {
        this.speed += this.level;
    }
}
