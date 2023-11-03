package udemy.s25.functionalProgramming;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class _02_FPNumberRunner {
    public static void main(String[] args) {
        // Square number 1 to 10
        IntStream.range(1,11).map(e -> e*e).forEach(element -> System.out.println(element));

        // map to all lowercase
        List<String> words = List.of("Apple","Ant","Bat");
        words.stream().map(e -> e.toLowerCase()).forEach(e -> System.out.println(e));
        // map to print length
        List<String> words2 = List.of("Apple","Ant","Bat");
        words2.stream().map(e -> e.length()).forEach(e -> System.out.println(e));
        //스트림 종단 연산 - 총합, 평균, 최소, 최대, 리스트
        //하나의 결과 값
        IntStream.range(1,11).reduce(0,(n1,n2) -> n1 + n2);
        // 리스트의 최대 값 구하기
        List<Integer> numbers = List.of(23,12,34,54);
        numbers.stream().max((n1,n2) -> Integer.compare(n1,n2)).get();
        numbers.stream()
                .filter(e -> (e&2) == 1) //홀수 값만 return
                .collect(Collectors.toList()); // 리스트로 전달
        // 짝수만 리스트로 출력
        numbers.stream()
                .filter(e -> (e&2) == 0) //짝수 값만 return
                .collect(Collectors.toList()); // 리스트로 전달
        // 10개의 정수를 제곱한 값으로 리스트 생성
        IntStream.range(1,11)
                .map(e -> e*e) //intpipeline 형식
                .boxed() //intstream을 stream으로 변경 .boxed()
                .collect(Collectors.toList());

    }


}
