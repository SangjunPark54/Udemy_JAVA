package udemy.section8;

public class _02_MotorBikeClass {
    /*
    build a moto bike class
        - adjust speed and gears
    understand concepts of class,object,state,behavior
    understand encapsulation and abstraction
    클래스는 대문자로 시작
     */
    //behaviour
    // method
    // inputs - int speed
    // outputs - void
    // name - setSpeed
    //state
//    컨스트럭트 기본 값 설정 기본 생성자는 Argument가 없어야 함 ()
//    _02_MotorBikeClass() {
//        this.speed = 5;
//    }
    // 다른 생성자를 이용하여 값을 할당 할 수 있음.
    _02_MotorBikeClass() {
        this(5);
    }

    _02_MotorBikeClass(int speed) {
        this.speed = speed;
    }

    private int speed; //member variable (object)
    // private :  외부 클래스에서 접근을 제한 함
    public void setSpeed(int speed) { // local variable
        if(speed > 0)
            this.speed = speed; // local 변수를 지역변수로 설정 (object)


//        System.out.println(speed); // local variable
//        System.out.println(this.speed); // member variable
    }

    public int getSpeed() {
        return this.speed;
    }
    public void increaseSpeed(int howMuch) {
        setSpeed(this.speed + howMuch);
    }
    public void decreaseSpeed(int howMuch) {
        setSpeed(this.speed - howMuch);
    }

    public void start() {
        System.out.println("Bike Start");
        }
    /*
     캡슐화
        ** 외부로 부터 객체를 보호 **
        다른 클래스는 특정 클래스의 데이터를 직접적으로 바꿀 수 없음
        상태를 바꾸고 싶으면 해당 클래스의 메소드를 통해야함
        ** 데이터를 클래스에 가두는 것 **
      - 장점
        다른 클래스 코드의 잘못된 데이터를 차단
    추상화
        honda.increaseSpeed();를 실행할 뿐 실제로 어떻게 동작하는지 알 수 없다.
    생성자(Constructor)
        _02_MotorBikeClass ducati = new _02_MotorBikeClass();
        초기화 : _02_MotorBikeClass ducati = new _02_MotorBikeClass(100);
        다른 메소드 처럼 ReturnType을 요구하지 않는다.
        ex) nameOfTheMethod(parameters) {
            : nameOfTheMethod는 클래스 이름과 같아야 함.
        }
    */


}
