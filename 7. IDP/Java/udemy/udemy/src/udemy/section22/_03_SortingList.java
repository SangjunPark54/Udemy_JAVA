package udemy.section22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _03_SortingList {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(123,12,3,45);
        List<Integer> numberAl = new ArrayList<>(numbers);

//        numberAl.sort();
        Collections.sort(numberAl);
        System.out.println(numberAl);

    }
}
