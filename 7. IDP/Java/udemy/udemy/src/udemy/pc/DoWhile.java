package udemy.pc;

import java.util.Scanner;
public class DoWhile {
    /*
    int = 1;
    while (1 < 5) {
        System.out.print(i + "  ")
        i++;
    }

    do {
        System.out.print(i + "  ");
        i++;
    } while (1<5)
    While과 다르게 컨디션이 {} 아래에 위치한다.
    i = 10;
    while 실행 시 조건에 부합하는 경우만 실행된다.
     : 미실행
    do while로 실행하면 조건의 검증이 마지막이여서, 조건이 맞지 않더라도 한번은 실행된다.
     : 10

     연습 문제
     - 사용자의 번호 물어보기
     - 큐브의 번호 출력하기
     - 사용자가 음수를 입력할때까지 반복하기

     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = -1;
        do {
            if (number != -1) {
                System.out.println("Cube is " + (number * number * number));
            }
            System.out.println("Enter a number: ");
            number = scanner.nextInt();
        } while (number>=0);
        System.out.println("Have a Great Day!");
    }
}
