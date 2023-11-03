package udemy.s23;
/*
코딩 예제 – 역순 단어 제조기
이번 예제에서 여러분은 제공된 StringMagic 클래스 안에 reverseWordsInSentence라는 이름의 Java 메서드를 작성해야 합니다.

이 메서드는 문자열 문장을 입력으로 받아서 문장 안의 모든 단어가 역순으로 변경되지만 원래의 단어 순서는 유지되는 문자열을 리턴해야 합니다.

엣지 케이스:
입력된 문자열이 null이면 여러분의 메서드는 문자열 "INVALID"를 리턴해야 합니다.
입력된 문자열이 비어 있으면(즉, ""이면) 여러분의 메서드는 빈 문자열을 리턴해야 합니다.
입력 형식

문장으로 된 하나의 문자열.

출력 형식

문장의 모든 단어가 역순으로 되어 있으나 원래의 단어 순서는 유지하고 있는 문자열.

예시

그럼 몇 가지 예를 볼까요?

예 1

입력:

StringMagic sm = new StringMagic();
sm.reverseWordsInSentence("Hello World");
리턴 값:

"olleH dlroW"
예 2

입력:

StringMagic sm = new StringMagic();
sm.reverseWordsInSentence("");
리턴 값:

""
예 3

입력:

StringMagic sm = new StringMagic();
sm.reverseWordsInSentence(null);
리턴 값:

"INVALID"
참고사항

해답에서 우리는 Java 표준 라이브러리에 있는 메서드와 클래스를 몇 개 사용했습니다. 그럼 간단히 알아볼까요?

string.split(String regex): 이 메서드는 주어진 정규 표현식에 따라 문자열을 분할합니다.

stringBuilder: 문자열 조작 작업을 할 때는 StringBuilder를 쓰는 것이 String을 쓰는 것보다 더 효율적입니다.

stringBuilder.reverse(): 이 메서드는 StringBuilder안의 문자 순서를 역순으로 바꿉니다.

stringBuilder.append(String str): 이 메서드는 지정된 문자열을 시퀀스에 추가합니다.

string.trim(): 이 메서드는 앞과 뒤의 공백을 생략한 문자열 사본을 리턴합니다.

그럼 행운을 빕니다!
 */

import java.util.Arrays;

public class _03_StringMagic {
    public String reverseWordsInSentence(String sentence) {
        // TODO: Check if the sentence is null.
        // If the sentence is null, return "INVALID"
        if (sentence == null) {
            System.out.println("INVALID");
        }
        // TODO: Check if the sentence is empty.
        // If the sentence is empty, return an empty string
        if (sentence == "") {
            return "";
        }
        // TODO: Split the sentence into words using the split method.

        StringBuilder reversedSentence = new StringBuilder();
        for (String word: sentence.split(" ")) {
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            reversedSentence.append(reversedWord).append(" ");
        }
        return reversedSentence.toString().trim();

        // Use " " as the delimiter to match space.

        // TODO: Loop through each word in the words array.

        // TODO: For each word, create a StringBuilder and reverse the word.
        // Append the reversed word, followed by a space, to the reversed sentence.

        // TODO: After reversing all the words, trim the trailing space and return the reversed sentence.

    }

    public static void main(String[] args) {
        String sentences = "Hello World!";
        String words[] = sentences.split(" ");
        System.out.println(Arrays.toString(words));
        StringBuilder string = new StringBuilder();

//        System.out.println(string.reverse());
    }
}