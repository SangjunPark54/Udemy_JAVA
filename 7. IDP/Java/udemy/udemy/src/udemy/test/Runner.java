package udemy.test;

public class Runner {
    public static void main(String[] args) {
        Controller honda = new Controller(0,5);
        honda.start();
        System.out.println(honda.getSpeed());
        honda.increaseLevel();
        System.out.println(honda.getSpeed());

    }


}
