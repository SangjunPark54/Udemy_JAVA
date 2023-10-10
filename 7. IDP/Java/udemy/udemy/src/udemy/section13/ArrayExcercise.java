package udemy.section13;

import udemy.section9.Bigdecimal;

import java.util.Arrays;

public class ArrayExcercise {

    public class Student {

        public static void main(String[] args) {


            int[] marks = {1, 2, 3, 4, 5, 6, 7, 8};
            for (int i = 0; i < marks.length; i++) {
                System.out.println(marks[i]);
            }
            int[] marks1 = new int[5];
            double[] values = new double[5];
            boolean[] test = new boolean[5];

            // 배열 전체 조회
            System.out.println(Arrays.toString(marks));

            int marks2[] = {100, 99, 95, 96, 100};
            for (int mark : marks2) {
                System.out.println(mark);
            }
            for (int i = 0; i < marks2.length; i++) {
                System.out.println(marks2[i]);
            }
            int marks3[] = new int[5];
            Arrays.fill(marks3, 100);
            // marks5의 모든 값은 100으로 설정

            int[] array1 = {1, 2, 3};
            int[] array2 = {1, 2, 3,};
            int[] array3 = {3, 2, 3};
            Arrays.equals(array1, array2);
            // 배열 비교
            Arrays.equals(array1, array3);

            // 배열 정렬
            Arrays.sort(array3);


        }
    }

    public static class Week {
        String week[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        public int getMaxWeek() {
            int maxlength = 0;
            for (int i = 0; i <= week.length; i++) {
                int length = week.length;
                if (maxlength < length) {
                    maxlength = length;
                }
            }
            return maxlength;
        }
    }
}

