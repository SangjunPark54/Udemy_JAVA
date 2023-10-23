package udemy.sction20;

public class _01_DesignClass {
    /*
  1. 클래스 기본
     - 클래스는 템플릿
     public class MotorBike {
        //state
        private int speed; // member variable

        //constructors
        MotorBike() {
          this(5);
        }
        MotorBike(int speed) {
          this.speed = speed;
        }
        //behavior
        public int getSpeed() {
          return speed;
        }
        ...
      }
        public static void main(String[] args) {
          MotorBike ducati = new MotorBike(100);
          MotorBike honda = new MotorBike(100);
          }
     - ducati, honda (인스턴스 = 객체)
     - MotorBike 클래스에는 speed라는 멤버 변수가 있음.
     - ducati(인스턴스)는 speed의 값을 가질 수 있음.
     - 멤버 변수의 State(상태) : 해당 시점에 객체가 가지는 멤버 변수에 대한 값을 의미
       : 상태는 사용되는 메소드에 의해서 계속 변화함.
    Sum-Up
      - 객체는 멤버 변수의 값으로 정의되는 '상태'라는 개념을 가짐.
      - 해당 객체의 인스턴스를 통해 노출되는 '행동'이라는 개념을 가짐.
  2. 클래스 디자인할때 고려할 점
   A. 상태가 어떠한가?
      현재 시점에서 어떤 변수 값을 가졌는가?
      예) MotorBike의 상태.
          speed 변수를 통해 MotorBike 상태를 변화
   B. 어떤 생성자를 가지는가
      클래스가 어떻게 구성되길 원하는가?
      인스턴스를 만들었을때 초기값을 미리 설정
   C. 어떠한 행동을 취할것인가
      객체를 통해 실행하고자하는 메소드가 어떤게 있을가?

     */

}
