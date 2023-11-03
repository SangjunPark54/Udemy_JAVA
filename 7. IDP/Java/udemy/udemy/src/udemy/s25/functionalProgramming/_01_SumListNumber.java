package udemy.s25.functionalProgramming;

import java.util.List;

public class _01_SumListNumber {

    private static int nomalSum(List<Integer> numbers) {
        int Sum = 0;
        for (int number : numbers) {
            Sum += number;
        }
        return Sum;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(4,6,8,13,3,15);
        numbers.stream().forEach(element -> System.out.println(element));

        int sum = numbers.stream().reduce(0,(number1, number2) -> number1 + number2);
                        //2개의 파라메터에는 ()가 필요

        int sumOdd = numbers.stream() //stream에는 중간 연산과 종단 연산 이 있음
                .filter(element -> (element%2) == 1) //중간 연산 filter, sort, distint
                .reduce(0, (number1, number2) -> number1 + number2); //종단 연산 forEach

        int sumEven = numbers.stream()
                .filter(element -> (element%2) == 0)
                .reduce(0,(number1, number2) ->{
                    System.out.println(number1 + " " +number2);
                    return number1 + number2;
                    // 메서드
                });

        int sumLamda = numbers.stream()
                .reduce(0,(number1, number2) -> number1 + number2);
        // 일반적인 로직. Mutation(변이) sum 값이 계속 변함.
        // 함수형 프로그래밍에서는 변수의 변이를 피한다.
        // 람다 표현식 (Lamda Expression)
        // 중간 연산 Sort
        List<Integer> numbers2 = List.of(3,5,3,5,8,213,45,4,7);
        System.out.println("---");
        numbers2.stream().sorted().forEach(element -> System.out.println(element));
        // 중복 제거
        System.out.println("---");
        numbers2.stream().distinct().forEach(element -> System.out.println(element));
        System.out.println("---");
        // 중복 제거 & Sorting
        numbers2.stream().distinct().sorted().forEach(element -> System.out.println(element));
        System.out.println("---");
        //map 모든 element를 e*e를 한다
        numbers2.stream().distinct().map(e -> e *e).forEach(element -> System.out.println(element));

        System.out.println(sum);
        System.out.println(sumEven);
        System.out.println(sumOdd);
    }
}
