package udemy.pc;

import java.util.Scanner;

public class ChooseLoop {
    /*
    어떠한 반복 문을 사용할 것인가?
    For : 얼마나 많이 실행해야 할지 정확히 아는 경우
     for를 사용하는 경우 while과 do while 모두 사용이 가능 하다.
    While : 얼마나 많이 실행해야할지 모르지만, 특정 상황에서 반복을 끝내야할 때.
    Do While : 얼마나 많이 실행해야할지 모르지만, 특정 상황에서 반복을 끝내야할 때. 하지만 최소 한번은 실행되어야 할때 사용
     */
    public static void main(String[] args) {
        Exercise();
    }
    public static void Exercise() {
        int operation;

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Number1: ");
            int number1 = scanner.nextInt();

            System.out.println("Enter Number1 :");
            int number2 = scanner.nextInt();

            System.out.println("1 - Add");
            System.out.println("2 - Subtract");
            System.out.println("3 - Divide");
            System.out.println("4 - Multiply");
            System.out.println("5 - Exit");

            System.out.println("Choose Operation");
            operation = scanner.nextInt();
        do  {
            if (operation != 5) {
                if (operation == 1) {
                    System.out.println("Result is " + number1 + number2);
                } else if (operation == 2) {
                    System.out.println("Result is " + (number1 - number2));
                } else if (operation == 3) {
                    System.out.println("Result is " + number1 / number2);
                } else if (operation == 4) {
                    System.out.println("Result is " + number1 * number2);
                }
            }
        } while (operation>=0);
    }
}
