package udemy.section9;

public class PostiPrei {
    public static void main(String[] args) {
        int eight = 010; //8 (8진수)
        int sixteen = 0x10; //16 (16진수)
        int fifteen = 0xF; //15 (16진수)

        int i =  3456;
        // short s = i; // 컴파일 에러
        short s1 = (short) i; //형변환 (Explicit)
        int i2 = s1; // 형변환 (Implicit)

        int i1 = 10;
        int j1 = i1++; // 출력 10 // 값을 받음.1을더함
        System.out.println(j1); // 출력 11

        int i3 = 10;
        int j = i3--; //출력 10  // 값을 받음. 1을 뺌.
        System.out.println(j); // 출력 9
    }
}
