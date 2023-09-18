package udemy.test;

import java.util.Scanner;

public class Constructor1 {
    private int number;
    public Constructor1(int number) {
        this.number = number;
        number = 10;
        System.out.println(number);
        System.out.println(this.number);
    }
    public class Animals {
        private String Animal;

        public Animals (String Name) {
            this.Animal = Name;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number to Constructor1");
        Constructor1 number1 = new Constructor1(scanner.nextInt());
        System.out.println(number1);

    }
}
