package udemy.section13;

import udemy.section9.Bigdecimal;
import udemy.section13.Student;

import java.math.BigDecimal;

public class StudentRunner {
    public static void main(String[] args) {

//        Student student = new Student("Sean", new int[]{99, 97, 100});
        //new int를 없애려면 가변 변수를 사용하면 된다.
        Student student = new Student("Sean", 99, 97, 100);

        Student student1 = new Student("Adam", 99, 97);

        Student student2 = new Student("Eve", 99, 97, 100, 10);

        int number = student.getNumberOfMarks();
        System.out.println("Number of Mark");
        System.out.println(number);
        int sum = student.getTotalSumOfMarks();
        System.out.println("Total SUM: " + sum);

        int maximumMark = student.getMaximumMarks();
        System.out.println("MAX is : " + maximumMark);

        int minimumMark = student.getMinimumMarks();
        System.out.println("Min is : " + minimumMark);

        BigDecimal average = student.getAverageMarks();
        System.out.println("AVG is : " + average);

        //배열의 크기가 5로 지정되어 있으면, 향 후 배열의 크기를 변경할 수 없다.
        //6으로 늘리기 위해선, 기존 배열의 값을 복사하여 재 할당해야한다.
        //ArrayList로 이를 해결 가능.
        student.addMarks(45);
        student.removeMarks(1);
        System.out.println(student);
    }
}
/*
 가변 변수
 - 여러개의 인수중에 가변 변수는 가장 마지막에 정의 되어야한다.
  void print(int... values) {
    System.out.println(Arrays.toString(values));
    }

    int sum(int... values) {
        int sum = 0;
        for(int value:values) {
            sum += value;
        }
        return sum;
    }

 */