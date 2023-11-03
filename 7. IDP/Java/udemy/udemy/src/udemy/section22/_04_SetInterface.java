package udemy.section22;

import java.util.HashSet;
import java.util.Set;

public class _04_SetInterface {
    /*
    set인터페이스는 컬렉션 인터페이스를 연장한다.
    유니크한 하나의 객체만 설정할 수 있다.
    2개의 객체가 같다면 설정할 수 없음.
    set인터페이스는 위치 접근을 지원하지 않음
     */
    public static void main(String[] args) {
        Set<String> set = Set.of("Apple", "Banana", "cat");
//        set.add("Apple");
        System.out.println(set);
        Set<String> hashset = new HashSet<>(set);
        hashset.add("Apple");
        System.out.println(hashset);
        // Set은 위치(포지션)를 상관하지 않는다.
        // set.add(2, "Apple"); 이 실행되지 않음
        // set은 데이터의 더하거나 제거가 불가능
        // Set은 유일한(유니크) 데이터를 저장하는 용도


    }
}
