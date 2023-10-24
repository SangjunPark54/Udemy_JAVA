package udemy.section20;

public class _03_MarioGame implements _03_GamingConsole{

    @Override
    public void up() {
        System.out.println("Jump");
    }

    @Override
    public void down() {
        System.out.println("Goes into a hole");
    }

    @Override
    public void left() {

    }

    @Override
    public void right() {
        System.out.println("Go Forwards");
    }
}
