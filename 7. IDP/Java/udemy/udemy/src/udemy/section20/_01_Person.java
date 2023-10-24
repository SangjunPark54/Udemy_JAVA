package udemy.section20;

public class _01_Person extends Object{
    // 클래스 상속
    // extends Object가 없어도 objects 클래스는 기본값으로 상속함.
    private String name;
    private String email;
    private String phoneNumber;

//    public _01_Person() {
//        System.out.println("Person Constructor");
//    }
    public _01_Person(String name) {
        System.out.println("Person Constructor");
        this.name = name;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    // Overriding
    public String toString() {
        return name + "@" + email + "@" + phoneNumber;
//        return getClass().getName() + "#" + Integer.toHexString(hashCode());
    }

}
