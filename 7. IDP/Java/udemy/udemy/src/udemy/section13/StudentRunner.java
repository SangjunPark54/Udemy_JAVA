package udemy.section13;

import udemy.section9.Bigdecimal;
import udemy.section13.Student;

import java.math.BigDecimal;

public class StudentRunner {
    public static void main(String[] args) {
        int[] marks = {99, 97, 100};

        Student student = new Student("Sean", marks);
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
    }
}
