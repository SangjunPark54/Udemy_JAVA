package udemy.s25.functionalProgramming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/*
함수 인터페이스 이면의 원리
람다를 실행하면 어떤 일이 일어나나??
Functional Interface에 기반을 두어 실행됨.
코드가 어떻게 filter 메소드에 전달되는가?
stream of integer로 전달, Predicate Interface로 전달
Predicate 인터페이스는 test 통과했는지 아닌지에 대한 값을 던진다.
 */
class EvenNumberPredicate implements Predicate<Integer> {

    @Override
    public boolean test(Integer number) {
        return number%2 ==0;
    }
}

class EvenNumberConsumer implements Consumer<Integer> {

    @Override
    public void accept(Integer integer) {
        System.out.println(integer);
    }
}
class EvenNumberMap implements Function<Integer, Integer> {

    @Override
    public Integer apply(Integer number) {
        return number*number;
    }
}
public class _04_LamdaBehind {

    public static void main(String[] args) {
        List.of(23,43,34,45,36,48).stream()
                .filter(n -> n%2 ==0) // 자바 컴파일러가 함수형 인터페이스를 실행하게 됨.
                       // 로직의 메소드를 실행.
                .map(n -> n * n)
                .forEach(e -> System.out.println(e));

        List.of(23,43,34,45,36,48).stream()
        //Stream<T> filter(Predicate<? super T> predicate);
        //boolean test(T t);
                .filter(new EvenNumberPredicate())
        //<R> Stream<R> map(Function<? super T, ? extends R> mapper);
        //R apply(T t);
                .map(new EvenNumberMap())
//        void forEach(Consumer<? super T> action);
//        void accept(T t);
                .forEach(new EvenNumberConsumer());
    }
}
