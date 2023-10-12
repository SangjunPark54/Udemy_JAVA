package udemy.section20;

public class RectangleRunner {
    public static void main(String[] args) {
        RectangleClass rectangle = new RectangleClass(5,10);
        System.out.println(rectangle);
        rectangle.setWidth(5);
        System.out.println(rectangle);
        rectangle.setLength(2);
        System.out.println(rectangle);
        rectangle.getWidth();
        rectangle.getLength();

    }
}
