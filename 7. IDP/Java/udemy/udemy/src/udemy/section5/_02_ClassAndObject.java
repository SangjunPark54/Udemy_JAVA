package udemy.section5;

public class _02_ClassAndObject {
    /*
    Class : 템플릿으로 여러 인스턴스를 생성하여 실행
            Country(Class) - > India, USA, Korea (Object)
            class Country {
            }
            인스턴스 생성
            Country india = new Country()
                - Country : Class, india : Object
                - int : 원시 데이터 유형
    Object : 인스턴스 of Template
     */
    public class planet {
        planet earth = new planet();
        planet jupiter = new planet();
        planet venus = new planet();
        // 메소드 정의
        static void revolve(){
            System.out.println("Revolve");
        }
    }
    // Error: non-static method revolve() cannot be referenced from a static context.
    // >
    public static void main (String[] args) {
        planet.revolve();
    }
}
