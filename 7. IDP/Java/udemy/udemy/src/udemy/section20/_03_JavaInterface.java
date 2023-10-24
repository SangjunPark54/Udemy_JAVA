package udemy.section20;

public class _03_JavaInterface {
    /*
    인터페이스와 추상 클래스의 차이
    인터페이스는 콘솔 게임기의 컨트롤러의 버튼
    공통적인 시행 가능 행동들을 대표.

    Project wants to outsource an Complex Algorithm
    int complexAlgorithm(int number1, int number2)
    인터페이스는 2개의 클래스의 소통을 위한 계약을 이루어줌.
    - 공통적인 실행 가능 행동을 규약.
    - 코드의 변경 없이 인스턴스를 생성하는 인터페이스의 교체만으로 구현 가능.
*/

    // 인터페이스를 연장(extends)할 수 있음.
    // 하지만 두번째 인터페이스를 구현하고 싶으면, 연장하려는 인터페이스와 연장하는 인터페잇의 메소드를 구현해야함. (method1, method2)
    public interface Interface1 {
        void method1();
    }
    public interface Interface2 extends Interface1 {
        void method2();
    }
    public class Implementation implements Interface2 {

        @Override
        public void method1() {       }

        @Override
        public void method2() {        }
    }
    // 둘중 하나만 메소드를 구현하고 싶으면, 추상클래스를 사용
    // 연장하는 인터페이스에 대한 구현이 없는 그저 인터페이스만 구현하는 추상 클래스를 만들 수 있음.
    // 하지만 그 추상 클래스를 어떤 구상 클래스가 연장한다면, 구상 클래스와 추상 클래스 사이에서 인터페이스와 하위 인터페이스에서 정의된 모든 메소드들을 구현해야함.
    public abstract class ImplementationAbstract implements Interface2 {
        public void method1() {
        }
        // method2를 정의하지 않아도 가능.
    }

    public interface Interface3 {
        int test = 5; //이건 상수
        //int test; 불가 (변수)
        // 인터페이스에선 변수가 아닌 상수를 만들 수 있음.
    }
    public interface Interface4 {
        default void print() {
            System.out.println("default");
        }
    }
    public static class Test implements Interface4 {

    }
    public static class Test1 implements Interface4 {
        public void print() {
            System.out.println("override");
        }
    }

    public static void main(String[] args) {
        Test1 test = new Test1();
        test.print();
    }
    /*
    Interface vs Abstract Class

     */
}
