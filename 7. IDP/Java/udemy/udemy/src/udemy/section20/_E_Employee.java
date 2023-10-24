package udemy.section20;

public class _E_Employee extends _01_Person {
    /*
    extends Address, Book 같은 다중 상속은 안된다. C++는 가능.
    relationship chain은 가능
    예:
    public class Animal {}
    public class Pet extends Animal {}
    public class Dog extends Pet {}
    Pet pet = new Animal() : 가능 (상속)
    Dog dog = new Dog() : 불가능 (상속이 아님)
     */
    private String title;
    private String employer;
    private String employeeGrade;
    private int salary;
    //toString override
    public _E_Employee(String name, String title) {
        //super(); 함축적으로 super 를 호출하게 된다.
        super(name); //super class의 name을 불러옴
        this.title = title;
        System.out.println("Employee Constructor");
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public String getEmploeeGrade() {
        return employeeGrade;
    }

    public void setEmploeeGrade(String emploeeGrade) {
        this.employeeGrade = emploeeGrade;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return super.toString() + "#" + title + ":" + employer + "(" + employeeGrade + ")" + " - " + salary;
    }
}
