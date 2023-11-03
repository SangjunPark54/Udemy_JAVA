package udemy.s23;

public class _02_MyString {
/*
코딩 예제 – 16진수 문자열인지 검사하기
이번 문제에서는 MyString 클래스와 String변수 str,
그리고 isHexadecimalChar(char ch)와 isHexadecimal()이라는 2개의 메서드가 제공됩니다.
여러분은 이 메서드들을 완성해야 합니다.

여기서 문자열은 숫자(0 ~ 9)와 문자 A ~ F(대소문자 불문)만 포함되어 있는 경우에만 유효한 16진수로 간주됩니다.
문자가 유효한 16진수 문자(A ~ F 또는 a ~ f)일 경우, isHexadecimalChar(char ch) 메서드는 true를 리턴해야 하고,
그렇지 않으면 false를 리턴해야 합니다.
만일 문자열 str이 유효한 16진수 문자열이면 isHexadecimal()메서드는 true를 리턴해야 하고, 그렇지 않으면 false를 리턴해야 합니다.

엣지 케이스
문자열이 비어 있거나 null인 경우, isHexadecimal()메서드는 false를리턴해야 합니다.
isHexadecimalChar(char ch) 메서드는 대소문자를 모두 처리해야 합니다.

예시
"123F" => true"A23g" => false.
참고사항
Character.isDigit(char ch) 메서드는 문자가 숫자인지 검사합니다.
String.toCharArray() 메서드는 문자열을 문자 배열로 변환합니다.
관계 연산자 >= 과 <=을 사용하여 어떤 문자가 특정한 범위 안에 있는지 검사합니다.
ASCII에서 소문자와 대문자의 차이에 유의하십시오. ‘a’ ~ ’f’와 ‘A’ ~ ’F’는 다른 범위에 있습니다.
 */
//    public String str;

    //    public _02_MyString(String str) {
//        this.str = str;
//    }
//// 0 ~ 9 48 <= ch || ch <= 57
//    //a 97 f 102
//
//    public boolean isHexadecimalChar() {
//        char[] ch = str;
//        if ( 65 <= ch || ch <= 70 || 97 <=ch || ch <= 102 ) {
//            return true;
//        } if (str == null) {
//            return false;
//        }
//        return false;
//    }
//
//    public boolean isHexadecimal() {
//        char[] str1 = this.str.toCharArray();
//        if ( 48 <= str1 || str1 <= 57 || 67 <= str1 || str1 <= 70) {
//            return true;
//        }
//        return false;
//    }
//
//    public static void main(String[] args) {
//        String str = "1234Q";
//        char[] ca = str.toCharArray();
////        System.out.println((int)a);
//        System.out.println(ca);
//    }
// 유데미
    public String str;

    public _02_MyString(String str) {
        this.str = str;
    }

    public boolean isHexadecimalChar(char ch) {
        //a-f A-F
        return (
                (ch >= 'a' && ch <= 'f') ||
                        (ch >= 'A' && ch <= 'F')
        );
    }

    public boolean isHexadecimal() {
        if (str == null || str.equals("")) {
            return false;
        }
        // check hexadecimal
        for (char ch : str.toCharArray()) {
            //enhanced loop (A-F, a-f, 0-9)
            if (!isHexadecimalChar(ch) && Character.isDigit(ch)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        _02_MyString myString = new _02_MyString("ABCD");


    }
}


