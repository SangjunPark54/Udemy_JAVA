package udemy.section4;

public class _03_ArgumentsExercises {

    static void printNumbers(int n1){
        int i;
        for (i=1; i <= n1; i++) {
            System.out.println(i);
        }
    }
    static void printSquaresOfNumbers(int n2) {
        int j;
        for (j=1; j <= n2; j++) {
            if (j%2 == 0){
                System.out.println(j);
            }
        }
    }
    public static void main(String[] args) {
        printNumbers(10);
        printSquaresOfNumbers(10);
    }
}
