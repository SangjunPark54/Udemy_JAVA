package udemy.section21;
/*
이 프로그램은 도형을 생성하고 면적을 계산하며 그 도형에 대한 정보를 프린트합니다.
이 프로그램은 구체적인 도형 유형에 대한 서브클래스가 있는 추상 베이스 클래스인 Shape를 정의합니다.
모든 도형은 면적을 계산할 수 있어야 합니다.
이 예제에서 우리가 고려하는 모양은 Circle과 Rectangle입니다.
여러분의 과제는 Shape추상 클래스를 확장하는 클래스인 Circle과 Rectangle을 구현하여 코드를 완성하는 것입니다.
그 모든 클래스에는 반드시 도형의 면적을 계산하고 리턴하는 calculateArea() 메서드가 있어야 합니다.

엣지 케이스
원의 반지름과 직사각형의 길이와 폭은 양수여야 합니다. 여러분은 그 입력값들이 양수라고 가정할 수 있습니다.
입력 형식
입력값은 도형의 치수가 되고, 인스턴스를 생성할 때 해당되는 생성자에게 전달될 것입니다.
원의 경우, 반지름이 입력값이고 직사각형의 경우 길이와 폭이 입력값입니다.
다음은 예시입니다.
Shape circle = new Circle("Circle", 5.0); // Here, "Circle" is the name and 5.0 is the radius
Shape rectangle = new Rectangle("Rectangle", 4.0, 6.0); // Here, "Rectangle" is the name, 4.0 is the length, and 6.0 is the width
공식
원의 면적 - Math.PI * radius * radius.
직사각형의 면적 - length * width.
참고사항
이번 예제에서 우리는 상속과 추상 클래스를 사용합니다. Shape클래스는 추상 클래스이며, Circle과 Rectangle클래스에 의해 확장됩니다.
super(name)을 사용하여 수퍼클래스 Shape의 생성자를 호출합니다. 이 구문은 Circle과 Rectangle의 생성자에서 첫 번째 구문으로 필요합니다.
Math.PI는 PI 값을 나타내는 상수이며 대략 3.14159입니다.원의 면적을 계산하기 위해 사용합니다.
calculateArea()는 Shape의 추상 메서드이며 Circle와 Rectangle클래스 안에서 (오버라이드되어) 구현됩니다.
키워드 this는 현재의 객체를 가리키며, 객체의 속성에 액세스하기 위해 사용합니다.
 */
public abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double calculateArea();

    public void displayInfo() {
        System.out.println("Shape: " + name);
        System.out.println("Area: " + calculateArea());
    }

//    public static class Circle extends Shape {
    class Circle extends Shape {

        private double radius;

        public Circle(String name, double radius) {
            super(name);
            this.radius = radius;
        }

        @Override
        public double calculateArea() {
            return (Math.PI * radius * radius) ;
        }
    }
//    public static class Rectangle extends Shape {
    class Rectangle extends Shape {

        private double length;
        private double width;

        public Rectangle(String name, double length, double width) {
            super(name);
            this.length = length;
            this.width = width;
        }

        @Override
        public double calculateArea() {
            return length * width;
        }
    }
}
