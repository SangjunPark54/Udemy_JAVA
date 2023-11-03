package udemy.s24.generic;

import java.util.ArrayList;

public class _00_MyCustomList<TYPE> {
//    public class _00_MyCustomList<TYPE extends Number> 숫자만 사용하고 싶을때 extends Number 추가
    ArrayList<TYPE> list = new ArrayList<>();

    public void addElement(TYPE element) {
        list.add(element);
    }

    public void removeElement(TYPE element) {
        list.remove(element);
    }

    public String toString() {
        return list.toString();
    }

    public TYPE get(int i) {
        return list.get(i);
    }
}
