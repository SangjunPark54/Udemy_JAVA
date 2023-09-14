package udemy.section10;

import java.util.Scanner;

public class MenuRunner {
    public static void main(String[] args) {
        // Type Obj = new Type(argument);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number1: ");
        int number1 = scanner.nextInt();
        System.out.println("The number you Enter is - " + number1);

        System.out.print("Enter Number2: ");
        int number2 = scanner.nextInt();
        System.out.println("The number you Enter is - " + number2);

        System.out.println("Choose Operations: ");
        System.out.println("1: add");
        System.out.println("2: negative");
        System.out.println("3: divide");
        System.out.println("4: multiply");

        System.out.println("Enter Choice: ");
        int choice = scanner.nextInt();

        System.out.println("the operation you chooses are ");
        System.out.println("number1 " + number1);
        System.out.println("number2 " + number2);
        System.out.println("choice " + choice);

        performOperationUsingSwitch(number1, number2, choice);
    }

//    private static void performOperationUsingNestedIfels(int number1, int number2, int choice) {
//        if(choice == 1) {
//            System.out.println("Result is " + (number1 + number2));
//        } else if(choice == 2) {
//            System.out.println("Result is " + (number1 - number2));
//        } else if(choice ==3) {
//            System.out.println("Result is " + (number1 / number2));
//        } else if (choice == 4) {
//            System.out.println("Result is " + (number1 * number2));
//        } else {
//            System.out.println("Invalid Operation");
//        }

    private static void performOperationUsingSwitch(int number1, int number2, int choice) {
        switch (choice) {
            case 1:
                System.out.println("Result is " + (number1 + number2));
                break;
            case 2:
                System.out.println("Result is " + (number1 - number2));
                break;
            case 3:
                System.out.println("Result is " + (number1 / number2));
                break;
            default:
                System.out.println("Result is " + (number1 * number2));
                break;
        }
    }
}
