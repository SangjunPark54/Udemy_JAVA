package udemy.section8;

public class _03_MotorBikeRunner {
    public static void main(String[] args) {
        _02_MotorBikeClass ducati = new _02_MotorBikeClass(100);
        _02_MotorBikeClass honda = new _02_MotorBikeClass(200);

        ducati.start();
        honda.start();
//        다른 클래스의 데이터를 직접 조작
//        ducati.speed = 100;
//        honda.speed = 80;
//
//        ducati.speed = 20;
//        honda.speed = 0;
    // 다른 클래스의 데이터를 조작하기 위해 메소드를 사용 (캡슐화)
//        ducati.setSpeed(100);

        ducati.increaseSpeed(100);
        honda.increaseSpeed(100);

        ducati.decreaseSpeed(150);
        honda.decreaseSpeed(250);
//        int ducatiSpeed = ducati.getSpeed();// get ducati speed
//        ducatiSpeed = ducatiSpeed + 100;// icrease it by 100
//        ducati.setSpeed(ducatiSpeed);// set it to ducati

//        int hondaSpeed = honda.getSpeed();// get ducati speed
//        hondaSpeed = hondaSpeed + 100;// icrease it by 100
//        honda.setSpeed(hondaSpeed);// set it to ducati

        System.out.println(ducati.getSpeed());
        System.out.println(honda.getSpeed());
    }
}

