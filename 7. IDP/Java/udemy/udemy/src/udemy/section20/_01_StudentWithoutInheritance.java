package udemy.section20;

public class _01_StudentWithoutInheritance {
    // Person 클래스와 중복
    private String name;
    private String email;
    private String phoneNumber;
    // Person 클래스와 중복

    private String college; // Add
    private int year;
// Person 클래스의 Getter, Setter와 중복
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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
// Person 클래스의 Getter, Setter와 중복
    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
