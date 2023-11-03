package udemy.section22;

import java.util.Set;
import java.util.TreeSet;

public class _08_TreeSet {
    //NavigableSet 활용
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>(Set.of(65,54,34,12,99));
        System.out.println(numbers);
        System.out.println(numbers.floor(40));
        System.out.println(numbers.floor(34));
        System.out.println(numbers.lower(34));
        System.out.println(numbers.ceiling(36));
        System.out.println(numbers.higher(34));
        System.out.println(numbers.subSet(20,80));
        System.out.println(numbers.subSet(34,54));
        System.out.println(numbers.subSet(34,65));
        System.out.println(numbers.subSet(34,true,65,true));
        System.out.println(numbers.subSet(34,false,65,false));
        System.out.println(numbers.headSet(50));
        System.out.println(numbers.tailSet(50));

    }
}
