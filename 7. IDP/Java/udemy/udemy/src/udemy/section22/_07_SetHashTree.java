package udemy.section22;

import java.util.*;

public class _07_SetHashTree {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(43);
        numbers.add(444);
        numbers.add(4332223);
        numbers.add(44332);
        numbers.add(3);
        System.out.println(numbers); // 입력 순서와 무관하게 데이터가 저장된다

        Set<Integer> numbersLH = new LinkedHashSet<>();
        numbersLH.add(43);
        numbersLH.add(444);
        numbersLH.add(4332223);
        numbersLH.add(44332);
        numbersLH.add(3);
        System.out.println(numbersLH); // 입력 순서대로 데이터가 저장.
        numbersLH.add(0303);
        System.out.println(numbersLH); // 입력 순서대로 데이터가 저장.
        System.out.println(numbersLH.add(0303)); // 중복 값을 저장할 수 없음.

        Set<Integer> numbersTr = new TreeSet<>();
        numbersTr.add(43);
        numbersTr.add(444);
        numbersTr.add(4332223);
        numbersTr.add(44332);
        numbersTr.add(3);

        System.out.println(numbersTr); // 데이터가 정렬되어 출력
        System.out.println(numbersTr.add(3)); // 데이터를 중복 저장할 수 없음

        // 캐릭터의 중복 값을 제거하고 오름차순으로 정렬
        List<Character> characters = List.of('a','z','a','b','z','f');

        Set<Character> characters1 = new TreeSet<>(characters);
        System.out.println("Original : " + characters);
        System.out.println("TreeSet : " +characters1);
        Set<Character> LinkedHashSet = new LinkedHashSet<>(characters);
        System.out.println("LinkedHashSet : " + LinkedHashSet);
        Set<Character> HashSet = new HashSet<>(characters);
        System.out.println("HashSet : " + HashSet);

    }
}
