package udemy.section11;

public class Loops {
    public static void main(String[] args) {
        ForLoop2();
    }
    // For, While, Do While
    public static void ForLoop (){
        for(int i = 0; i < 10; i++) {
        System.out.print(i + "  ");
        }
    } // 1 2 3 4 5 6 7 8 9
    public static void ForLoop2 (){
        for(int i = 0; i < 10; i = i + 2) {
            System.out.print(i + "  ");
        }
    } // 0 2 4 6 8
    public static void ForLoop3 (){
        for(int i = 1; i < 10; i = i + 2) {
            System.out.print(i + "  ");
        }
    } // 1 3 5 7 9
    public static void ForLoop4 (){
        for(int i = 11; i < 10; i = i + 2) {
            System.out.print(i + "  ");
        }
    } // No Return
    public static void ForLoop5 (){
        for(int i = 11; i < 20;) {
            System.out.print(i + "  ");
            i++;
        }
    } // 11 12 13 14  15 16 17 18 19
    public static void ForLoop6 (){
        int i = 20;
        for(;i < 30;i++) {
            System.out.print(i + "  ");
            i++;
        }
    } // 21 22 23 24 25 26 27 28 29
    /*
    초기화 int i=0. 루프가 처음 실행될 때 설정

     */
}
