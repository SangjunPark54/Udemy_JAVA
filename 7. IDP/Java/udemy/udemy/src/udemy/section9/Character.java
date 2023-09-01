package udemy.section9;

public class Character {
    char ch = 'a';
    // chart ch = 'ab'; // 하나의 문자만 가능
    // 모든 캐릭터 값들은 unicode의 값을 가지고 있다.
    // 캐릭터 자료 형은 2바이트의 크기를 가짐
    char ch2 = '\u0022'; // unicode 0022 값을 지정할 수 있다.
    char ch3 = '\u00A2';


    public static void main(String[] args) {
        char ch4 = 65;
        char ch5 = 'G';
        char ch6;
        ch5 = ch4++;
        ch6 = (char) (ch4 + 5);
        char ch8 = '%';
        // ch4++; ch5 + 5;와 같은 연산도 가능.

        MyChar myChar = new MyChar('U');
//        myChar.isConsonant();
        System.out.println(myChar.isVowel());
        System.out.println(myChar.isNumber());
        System.out.println(myChar.isAlphabet());
        System.out.println(myChar.isConsonant());
        MyChar.printLowerCaseAlphabets();
        // static 메서드
        // 클래스에 있는 문자를 신경쓰지 않음. > 정적 메소드를 사용
        MyChar.printUperCaseAlphabets();

        //'a','e','i','o','u' and Capitals
//        System.out.println(myChar.isAlphabet());
//        MyChar.printLowerCaseAlphabets();

    }


}
