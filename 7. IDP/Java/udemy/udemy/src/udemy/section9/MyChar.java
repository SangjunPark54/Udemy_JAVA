package udemy.section9;

public class MyChar {
    /*
MyChar myChar = new MyChar('c');
System.out.println(myChar.isVowel());
        //'a','e','i','o','u' and Capitals
System.out.println(myChar.isNumber ());
System.out.println(myChar.isAlphabet());
MyChar.printLowerCaseAlphabets();
MyChar.printUpperCaseAlphabets();
 */
    private char ch;


    public MyChar (char ch) {
        this.ch = ch;
    }
    public boolean isVowel() {
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            return true;
        return false;
        // 메소드에 반환(return)이 많으면 이해하기 어려움. 간단한 반환은 예외.
        // 대문자 추가하여 테스트
        //
    }
    public boolean isNumber () {
        if ( 48 <= ch && ch <= 57 )
            return true;
        return false;
    }
    public boolean isAlphabet () {
        if ( 65 <= ch && ch <= 90 )
            return true;
        if ( 97 <= ch && ch <= 122 )
            return true;
        return false;
    }
    public boolean isConsonant() {
        // a, e, i, o, u
        if(isAlphabet() && !isVowel())
            return true;
        return false;
    }
//    public static void printLowerCaseAlphabets (int ch) {
//        if (65 <= ch && ch <= 90) {
//            int lower = ch + 32;
//            System.out.println((char)lower);

    public static void printLowerCaseAlphabets () {
         for (char ch = 'a'; ch <= 'z'; ch++)
          System.out.println(ch);
    }

//    public static void printUperCaseAlphabets (int ch) {
//        if ( 97 <= ch && ch <= 122 ) {
//            int uper = ch - 32;
//            System.out.println((char)uper);

    public static void printUperCaseAlphabets () {
         for (char ch = 'A'; ch <= 'Z'; ch++)
          System.out.println(ch);
    }
}
