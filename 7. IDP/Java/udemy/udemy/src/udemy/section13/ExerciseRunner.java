package udemy.section13;

import java.util.Arrays;

public class ExerciseRunner {
    public static void main(String[] args) {
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        //lenght moethod.
        String dayWithMostCharacters = "";
        for(String day:daysOfWeek) {
            if(day.length() > dayWithMostCharacters.length()) {
                dayWithMostCharacters = day;
            }
        }
        System.out.println(dayWithMostCharacters);

        for(int i=daysOfWeek.length-1; i>=0; i--) {
            System.out.println(daysOfWeek[i]);
        }
    }
}
