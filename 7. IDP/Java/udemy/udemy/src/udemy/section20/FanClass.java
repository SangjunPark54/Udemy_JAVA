package udemy.section20;

    /*
State (Member Variables)
- make
- radius
- color
- isOn
- speed
Constructors
- Fan(String make, double radius, String color
Behavior (Member Methods)
- void switchOn()
- void switchOff()
- void changeSpeed()
- String toString() using String.format moethod
     */
public class FanClass {
    //state
    private String make;
    private double radius;
    private String color;

    private boolean isOn;
    private int speed;

    // creation (무조건 필요한 값)
    public FanClass (String make, double radius, String color) {
        this.make = make;
        this.radius = radius;
        this.color = color;
    }

    //method for isOn
    public void isOn(boolean isOn) {
        this.isOn = isOn;
    }

    public void switchOn() {
        this.isOn = true;
        setSpeed((byte) 5);
    }

    public void switchOff() {
        this.isOn = false;
        setSpeed((byte) 0);
    }

    public void setSpeed(byte speed) {
        this.speed = speed;
    }
    //print
    public String toString() {
        return String.format("make - %s, radius - %f, color - %s, isOn - %b, speed - %d",
                    make, radius, color, isOn, speed);
    }


}
