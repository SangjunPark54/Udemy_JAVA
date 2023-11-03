package udemy.s25.functionalProgramming;

import java.util.List;

/*
매개변수로서 첫 함수
 */
public class _00_FunctionalProgramming {
    private static void printBasic(List<String> list) {
        for(String string: list) {
            System.out.println(string);
        }
    }
    //로직 추가 at로 끝나는 문자만 출력

    private static void printBasicWithFilter(List<String> list) {
        for (String string : list) {
            if (string.endsWith("at")) {
                System.out.println(string);
            }
        }
    }
    // 로직 추가 at로 끝나는 문자만 출력 (함수형)
    private static void printWithFPFilter(List<String> list) {
        list.stream()
                .filter(
                        element -> element.endsWith("at")
                ) //이 로직이 true일때만 아래 로직이 실행
                .forEach(
                element -> System.out.println("elements - " + element)
                // 람다 표현식. element들을 sout을 실행
                // 함수 코드를 실행.
        );
    }
    // 함수형 프로그래밍

    private static void printWithFP(List<String> list) {
        list.stream().forEach(
                element -> System.out.println("elements - " + element)
                // 람다 표현식. element들을 sout을 실행
                // 함수 코드를 실행.
        );
    }

    private static void printNumbers(List<Integer> Numbers) {
        Numbers.stream().forEach(
                element -> System.out.println(element)
        );
    }
    private static void printNumbersEven(List<Integer> Numbers) {
        Numbers.stream()
                .filter(element -> (element%2)==0)
                .forEach(
                element -> System.out.println(element)
        );
    }

    public static void main(String[] args) {
        // 기존 방식
        List<String> list = List.of("Apple","Bat","Cat","Dog");
//        printWithFP(list);
        printWithFPFilter(list);
        List<Integer> numbers = List.of(1,2,3,4,5,6);
//        printNumbers(numbers);
        printNumbersEven(numbers);
    }
}

