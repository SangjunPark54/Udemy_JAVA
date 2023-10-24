package udemy.section20;

public class _01_StudentRunner {
    public static void main(String[] args) {
        _01_Student student = new _01_Student("Sean","SKKU");
//        student.setCollegeName("SKKU");
//        student.setYear(4);

        _01_Person person = new _01_Person("sean");
//        person.setName("Sean");
        person.setEmail("seanpark@sk.com");
        // 모든 클래슨느 객체를 확장 한다.
        //모든 다른 클래스가 다른 객체나 클래스로부터 상속을 해야한다.
        String value = person.toString();
        System.out.println(value); //  같은 값을 출력 udemy.section20.Person@36baf30c
        System.out.println(person); // 같은 값을 출력 udemy.section20.Person@36baf30c




    }
}
