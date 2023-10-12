package udemy.section20;

public class FanRunner {
    public static void main(String[] args) {
        FanClass fan = new FanClass("man",1.1,"Blue");
        fan.isOn(true);
        fan.setSpeed((byte)110);
        System.out.println(fan);
        fan.switchOff();
        System.out.println(fan);
        fan.switchOn();
        System.out.println(fan);

    }
}
