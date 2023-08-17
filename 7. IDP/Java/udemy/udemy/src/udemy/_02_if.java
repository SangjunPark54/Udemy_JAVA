package udemy;

public class _02_if {
    public static void main(String[] args) {
        int a = 10;
        int b = 1;
        int c = 5;
        int d = 4;
        if (a + b > c + d) {
            System.out.println("a+b is greater than c+d");
        }

        int angle1 = 90;
        int angle2 = 45;
        int angle3 = 45;
        int sum = angle1 + angle2 + angle3;
        if (sum == 180) {
            System.out.println("This is triangle");
        }

            int number = 3;
            if (number % 2 == 0) {
                System.out.println("This is Even Number");
//                if else System.out.println("This is not Even Number")
            }
        }
}
