package udemy.s25.functionalProgramming;

import java.util.List;

public class _03_Optional {
    // java8부터 사용 가능
    // null point exception을 피하려고 사용
    public static void main(String[] args) {
        System.out.println
                (List.of(23,45,67,12)
                        .stream().filter(n -> n%2 ==0).max((n1,n2) -> Integer.compare(n1,n2)));
//        System.out.println(List.of(23,45,67).stream().filter(n -> n%2 ==0).max((n1,n2) -> Integer.compare(n1,n2)).get());
        System.out.println
                (List.of(23,45,67)
                        .stream().filter(n -> n%2 ==0).max((n1,n2) -> Integer.compare(n1,n2)).orElse(0));
        // orElse로 디폴트 값을 설정해 줄 수 있다.

    }
}
