package udemy.s24.generic;

import java.util.ArrayList;
import java.util.List;

public class _00_GenericRunner {
    /*
    왜 필요한가?
     - 어떤 요소든 저장하기위해 사용.
     */

    static <X> X doubleValue(X value) {
        return value;
    }

    static <X extends List> void duplicate(X list) {
        list.addAll(list);
    }

    // 상한 경계 wildcard

    static double sumOfNumberList(List<? extends Number> numbers) {
        double sum = 0.0;
        for (Number number:numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }

    // 하한 경계 wildcard
    static void addACoupleOfValues(List<? super Number> numbers) {
        numbers.add(1);
        numbers.add(1.0);
        numbers.add(1.0f);
        numbers.add(1l);
    }
    public static void main(String[] args) {
        List emptyList = new ArrayList<Number>();
        addACoupleOfValues(emptyList);
        System.out.println(emptyList);

        System.out.println(sumOfNumberList(List.of(1,2,3,4,5,6)));
        System.out.println(sumOfNumberList(List.of(1.1,2.2,3.3,4.4,5.5,6.6)));
        System.out.println(sumOfNumberList(List.of(1l,2l,3l,4l,5l,6l)));

        String value1 = doubleValue(new String());
        Integer number1 = doubleValue(Integer.valueOf(5));
        ArrayList list1 = doubleValue(new ArrayList());

        ArrayList<Integer> numbers = new ArrayList<>(List.of(1,2,3));
        duplicate(numbers);
        System.out.println(numbers);

        //ArrayList 클래스 생성 하고 싶음.
        _00_MyCustomList<String> list = new _00_MyCustomList<>();
        list.addElement("Element 1");
        list.addElement("Element 2");
        String value = list.get(0);

        System.out.println(list);
        System.out.println(value);
        _00_MyCustomList<Integer> list2 = new _00_MyCustomList<>();
        list2.addElement(Integer.valueOf(5));
        list2.addElement(Integer.valueOf(7));
        Integer number = list2.get(0);

        System.out.println(list2);
        System.out.println(number);
        // String만 가능하도록 구현되어 있기 때문에 Integer를 저장할 수 없음.
    }
}
