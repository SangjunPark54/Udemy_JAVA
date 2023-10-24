package udemy.section20;

import udemy.section13.Student;

public class _01_Student extends _01_Person {
    //extends Person : Person 클래스를 상속한다.
    private String collegeName;
    private int year;

    public _01_Student(String name, String collegeName) {
        super(name); // 상위 클래스의 name을 사용하도록 함.
        this.collegeName = collegeName;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
