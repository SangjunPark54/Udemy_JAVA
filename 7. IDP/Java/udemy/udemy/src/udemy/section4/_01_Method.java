package udemy.section4;

public class _01_Method {
    /*
    메소드 만드는 방법
    메소드 : 코드가 돌고 끝난 결과를 반환받음
        Retrun Type nameOfTheMethod() {
        // body of the method 코드는 메소드의 몸통
        }
    - 소문자, 숫자, $, _ 만 사용 가능
    - 메소드의 이름은 소문자로 시작한다.
    - 숫자로 시작하지 못한다.
    - 키워드는 사용 불가능
    - CamelCase 사용 권장
    ReturnType
    - void : 반환 하고 싶은것이 없을 때 사용
            void sayHelloWorldTwice() {
                System.out.println("Hello World");
                System.out.println("Hello World");
            }
     */

    // 메소드 정의

    static void sayHelloWorldTwice() {
        System.out.println("Hello World");
        System.out.println("Hello World");
    }


    static void sayHelloWorldThrice() {
        System.out.println("Hello World1");
        System.out.println("Hello World2");
        System.out.println("Hello World3");
    }

    static void sayStatements() {
        System.out.println("I've Created my first variable");
        System.out.println("I've Created my first method");
        System.out.println("I've Created my first loop");
        System.out.println("I'm excited to learn JAVA");
        }
    public static void main(String[] args) {
        sayHelloWorldThrice();
        sayStatements();
    }
}
