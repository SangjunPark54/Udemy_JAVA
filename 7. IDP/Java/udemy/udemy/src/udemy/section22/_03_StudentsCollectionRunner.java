package udemy.section22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// 만약 다양한 sort 방법을 제공 하려면?? 오름차순 과 내림차순

class DescendingStudentComparator implements Comparator<_03_Student> {

    @Override
    public int compare(_03_Student student1, _03_Student student2) {
        return Integer.compare(student1.getId(), student2.getId());
    }
}
class AscendingStudentComparator implements Comparator<_03_Student> {

    @Override
    public int compare(_03_Student student1, _03_Student student2) {
        return Integer.compare(student1.getId(), student2.getId());
    }
}

public class _03_StudentsCollectionRunner {
        public static void main(String[] args) {
            List<_03_Student> students = List.of(new _03_Student("Sean", 1),
                    new _03_Student("Rachel", 100),
                    new _03_Student("Eve", 2));
            List<_03_Student> studentAl = new ArrayList<>(students);

//            System.out.println(studentAl); //befor sort
//            Collections.sort(studentAl);
//            System.out.println(studentAl); //after sort
//            System.out.println("Asc " + studentAl); //내림차순 sort
//            Collections.sort(studentAl, new DesendingStudentComparator());


            studentAl.sort(new DescendingStudentComparator());
            System.out.println("Desc " + studentAl); //오름차순

            studentAl.sort(new AscendingStudentComparator());
            System.out.println("Asc " + studentAl); //오름차순
        }
}
