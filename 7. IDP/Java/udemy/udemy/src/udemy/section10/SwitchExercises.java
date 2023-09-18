package udemy.section10;

public class SwitchExercises {
    public static void main(String[] args) {
        System.out.println(determineNameOfDay(1));
        System.out.println(isWeekDay(0));
    }
    public static String determineNameOfDay(int dayNumber) {
        //input -number of day 0 to 6
        // return the day of week in text
        String result = "";
        switch (dayNumber) {
            case 0: return "Sunday"; //return 으로 출력할 경우 break가 필요없어짐
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wedneday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
        }
        return "InvalidDayy";
    }

    public static boolean isWeekDay(int dayNumber) {
        // intput - number of day 0 to 6
        // return if the day is Week Day.
        switch (dayNumber) {
            //case 0:
            //case 6: return false;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5: return true;
        }
        return false;
    }
    public static String determineNameOfMonth(int monthNumber) {
        // input - number of month 1(January) to 12 (December)
        // output - name of month\
        switch (monthNumber) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            case 5:
                System.out.println("5");
                break;
            case 6:
                System.out.println("6");
                break;
            case 7:
                System.out.println("7");
                break;
            case 8:
                System.out.println("8");
                break;
            case 9:
                System.out.println("9");
                break;
            case 10:
                System.out.println("10");
                break;
            case 11:
                System.out.println("11");
                break;
            case 12:
                System.out.println("12");
                break;
            default:
                System.out.println("Wrong Number");
        }
        return determineNameOfMonth(monthNumber);
    }

}
