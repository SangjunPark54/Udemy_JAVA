package udemy.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentsCollectionRunner {
    public static void main(String[] args) {
        List<Student> students = List.of(new Student("Sean", 1),
            new Student("Rachel", 100),
            new Student("Eve", 2));
        List<Student> studentAl = new ArrayList<>(students);

        System.out.println(studentAl); //befor sort
        Collections.sort(studentAl);
        System.out.println(studentAl); //after sort

    }
}
