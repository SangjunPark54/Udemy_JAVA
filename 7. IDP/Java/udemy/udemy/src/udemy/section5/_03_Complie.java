package udemy.section5;

public class _03_Complie {
    static class planet {
        void revolve() {
            System.out.println("Revolve");
        }
    public static void main(String[] args){
        planet earth = new planet();
        earth.revolve();
        }
    }
}
    /*
    1. Compile
        cd ~/location
        javac filename.java
        > filename.class 생성 확인
    2. run
        java filename.class
        Java를 실행하기 위해선 public static void main(String[] args)가 필요
    3. JVM, JDK and JRE
        - JVM : Bytecode를 운영체제에 맞도록 실행하는 가상 머신
        - JRE : Java Runtime Engine Only : JVM + 라이브러리
        - JDK : Java Development Kit = JRE + Compiler + Debugger
     */

