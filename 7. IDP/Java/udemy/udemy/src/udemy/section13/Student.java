package udemy.section13;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> marks = new ArrayList<Integer>();

    //constructor
//    public Student(String name, int[] marks) {
//        this.name = name;
//        this.marks = marks;
//    }
    public Student(String name, int... marks) {
        this.name = name;

        for (int mark : marks) {
            this.marks.add(mark);
        }
    }

    public int getNumberOfMarks() {
        //return Arrays.toString(marks);
        return marks.size();
    }

    public int getTotalSumOfMarks() {
        int sum = 0;
        for (int mark : marks) {
            sum = sum + mark;
        }
        return sum;
    }

    public int getMaximumMarks() {
        int maximum = Integer.MIN_VALUE;
        for (int mark : marks) {
            if (mark > maximum) {
                maximum = mark;
            }
        }
        return maximum;
    }

    public int getMinimumMarks() {
        int minimum = Integer.MAX_VALUE;
        for (int mark : marks) {
            if (mark < minimum) {
                minimum = mark;
            }
        }
        return minimum;
    }

    public BigDecimal getAverageMarks() {
        //sum
        //total
        //divide
        int sum = getTotalSumOfMarks();
        int number = getNumberOfMarks();
        return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);
    }

    public void addMarks(int mark) {
        marks.add(mark);
    }
    public void removeMarks(int mark) {
        marks.remove(mark);
    }

    public String toString() {
        return name + marks;
    }
}
