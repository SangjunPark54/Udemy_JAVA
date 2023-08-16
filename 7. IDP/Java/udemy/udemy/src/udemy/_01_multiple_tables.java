package udemy;

public class _01_multiple_tables {
    public static void main (String[] args) {
        int i;
        int j;
        for (i=0; i< 10; i++) {
            System.out.println(i + " 단 구구단");
            for (j=0; j < 10; j++) {
                System.out.printf("%d * %d = %d", i, j, i * j).println();
            }
        }
        System.out.println(Math.min(5, 10));

    }
}
/*
 \n : 줄바꿈
 \ : Escape 특수문자를 String으로 인식
 \t : Tap(탭) 출력
 */