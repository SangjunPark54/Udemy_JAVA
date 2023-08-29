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
    public int isNumber () {
        int i = (char) ch;
        return i;
    }
}
