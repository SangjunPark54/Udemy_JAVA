package udemy.section22;

import java.util.ArrayList;
import java.util.List;

public class _02_Puzzle {

    public static void main(String[] args) {
        List value = List.of("A",'A', 1,1.0);
        System.out.println(value);

        //오토복싱이라는 개념에 의해 다양한 타입의 요소가 저장

        System.out.println(value.get(0) instanceof Character);
        System.out.println(value.get(1) instanceof Character);
        System.out.println(value.get(2) instanceof Integer);
        System.out.println(value.get(3) instanceof Double);

        //List<String> textValue = List.of("A",'A', 1, 1.0); // String으로 담으려 하면 불가.
        List<Integer> numbers = List.of(101, 102, 103, 104, 105);
        System.out.println(numbers.indexOf(101));
        List<Integer> numbersAl = new ArrayList<>(numbers);
        System.out.println(numbersAl.indexOf(101));
        //numbersAl.remove(101); //실패
        numbersAl.remove(Integer.valueOf(101)); //성공
        System.out.println(numbersAl);

        int autoboxing = 10;
        Integer autoboxing2 = autoboxing;

        System.out.println(autoboxing);
        System.out.println(autoboxing2);
    }
}
