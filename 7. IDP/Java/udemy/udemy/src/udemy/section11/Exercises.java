package udemy.section11;

public class Exercises {
    private int number;
    public Exercises(int MyNumber) {
        this.number = MyNumber;
    }
    public boolean isPrime(int number) {
        // Guard Condition
        if(number<2) {
            return false;
        }

        for(int i = 2; i <= number-1; i++ ) {
            if (number % 2 == 0) {
                return false;
            }
        }
        return true;
    }
    public int sumUpToN(int number) {
        // 1+2+3+4+.. +n
        int sum = 0;
        for (int i=1; i <= number; i++) {
            sum = sum + i;
        }
        return sum;
    }
    public int sumOfDivisors(int number) {
        int sum = 0;
        for (int i=2; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public int printANumberTriangle(int number) {
        int i = 0;
        int j = 0;
        for (i = 1; i <=number; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        return 0;

    }

    public static void main(String[] args) {
        Exercises number = new Exercises(9);
        boolean isPrime = number.isPrime(9);
        System.out.println("isPrime  " + isPrime);
        int sum = number.sumUpToN(6);
        System.out.println("SUM is " + sum);
        int sumOfDivisors = number.sumOfDivisors(6);
        System.out.println("Sum Of Divisors " + sumOfDivisors);
        int printANumberTriangle = number.printANumberTriangle(2);
    }
}
