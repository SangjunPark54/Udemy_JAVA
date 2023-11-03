package udemy.s23;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
/*
코딩 예제 – 애너그램 검사기

여러분에게는 2개의 문자열 str1과 str2가 주어져 있습니다. 여러분의 과제는 str1과 str2가 서로 애너그램인지 판정하는 것입니다.
애너그램이란 단어나 문구의 글자를 재배열하여 만들어진 단어나 문구를 가리킵니다.
일반적으로는 원래의 글자를 정확히 한 번 사용합니다. 예를 들어 단어 “listen”은 “silent”의 애너그램이고 “hello”는 “olelh”의 애너그램입니다.
여러분은 StringMagic클래스의 areAnagrams(String str1, String str2) 메서드를 구현해야 합니다. 이 메서드는 만일 str1과 str2가 서로 애너그램이면 true를 리턴하고, 그렇지 않으면 false를 리턴합니다.

엣지 케이스:
비교할 때 대소문자는 가리지 않습니다. 즉 “Listen”과 “Silent”는 애너그램으로 간주해야 합니다.
str1또는 str2가 null이라면 메서드는 false를 리턴해야 합니다.
str1과 str2의 길이가 같지 않아도 메서드는 false를 리턴해야 합니다.

입력 형식
이 메서드는 2개의 매개변수를 받습니다.
str1- String
str2- String

출력 형식
이 메서드는 다음을 리턴해야 합니다.
true- str1과 str2가 애너그램인 경우.
false- str1과 str2가 애너그램이 아닌 경우.

지침
두 문자열이 애너그램인지 검사하기 위해 문자열들을 소문자로 변환합니다.
문자열들의 길이가 다른지 검사하여 만일 그렇다면 false를 리턴합니다.
문자열들을 문자 배열로 변환합니다.
문자 배열을 정렬합니다.
정렬된 배열이 같으면 true를 리턴합니다. 그렇지 않으면 false를 리턴합니다.

Java 라이브러리 메서드
도움이 되는 메서드 몇 개를 소개해 드립니다.
string.toLowerCase() – 문자열에 있는 모든 문자를 소문자로 변환합니다.
string.toCharArray() – 문자열을 새로운 문자 배열로 변환합니다.
Arrays.sort(charArray) – 지정된 배열을 숫자 오름차순으로 정렬합니다.
Arrays.equals(charArray1, charArray2) –지정된 두 문자 배열이 서로 같으면 true를 리턴합니다.
이 문제를 푸는 데 이 메서드들이 아주 유용하고, 여러분의 구현물에서 사용하시기를 권해 드립니다.
 */
public class _01_StringMagic {

     public static boolean areAnagrams(String str1, String str2) {
         if (str1 == null || str2 == null) {
             return false;
         }
         if (str1.length() == str2.length()) {
            String lowStr1 = str1.toLowerCase();
            String lowStr2 = str2.toLowerCase();

            char[] arrayStr1 = lowStr1.toCharArray();
            char[] arrayStr2 = lowStr2.toCharArray();

            Arrays.sort(arrayStr1);
            Arrays.sort(arrayStr2);

            return Arrays.equals(arrayStr1,arrayStr2);
            }
         return false;
    }

    public static void main(String[] args) {
//        String char1 = "iceman";
//        String char2 = "cinema";
//        char[] test1 = char1.toCharArray();
//        char[] test2 = char2.toCharArray();
//
//        Arrays.sort(test1);
//        Arrays.sort(test2);
//        System.out.println(Arrays.equals(test1,test2));
//        System.out.println(test1);
//        System.out.println(test2);

        System.out.println(_01_StringMagic.areAnagrams("iceman","cinema"));
    }
}

