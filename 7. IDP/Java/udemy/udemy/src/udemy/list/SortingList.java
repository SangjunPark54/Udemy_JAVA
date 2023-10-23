package udemy.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortingList {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(123,12,3,45);
        List<Integer> numberAl = new ArrayList<>(numbers);

//        numberAl.sort();
        Collections.sort(numberAl);
        System.out.println(numberAl);

    }
}
