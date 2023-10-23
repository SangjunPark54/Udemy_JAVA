package udemy.list;

public class Student implements Comparable<Student> {
    private String name;
    private int id;

    public Student(String name, int id) {
        super();
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String toString() {
        return "ID: " + id + ", Username: " + name;
    }

    // Comapre 인터페이스 추가
    @Override
    public int compareTo(Student that) {
        // Using ID 
        // Compare는 자바 7부터 지원
        return Integer.compare(this.id, that.id);
    }
}
