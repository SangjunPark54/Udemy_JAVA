package udemy.section22;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class _01_List {
    /*
    List 와 ArrayList
    List Interface
    - 어떤 위치에 요소를 지정하고 가져올 수 있음.
      List<String> words = List.of("Apple","Bat","cat");      // Immutable!!
      words.size(); 집합속의 데이터 갯수 확인
      words.isEmpty(); 비었는지 확인
      words.get(1); 인덱스 번호의 데이터 조회
      words.contains("Dog"); 집합속에 데이터가 있는지 조회
      words.indexOf("Cat"); 데이터가 속한 인덱스 조회

      Immutable List / Mutability List
      - 불별 : 생성 후 바꿀 수 없음
              List.of(), Map.of()와 같은게 Immutable 속성을 가짐
      - Mutable List : ArrayList, LinkedList, Vector
        List<String> wordsArrayList = new ArrayList<String>(words);
        List<String> wordsLinkedList = new LinkedList<String>(words);
        List<String> wordsVector = new Vector<String>(words);

        List.add("Dog") // 불가능
        wordsArrayList.add("Dog"); //가능

      -

     */
    List<String> Test = List.of("Apple","CAT");

    public static void main(String[] args) {
        List<String> Test = List.of("Apple","CAT");
        System.out.println(Test);
        System.out.println(Test.size());
        System.out.println(Test.isEmpty());
        System.out.println(Test.get(1));
        System.out.println(Test.contains("Apple"));
        System.out.println(Test.indexOf("CAT"));

        List<String> Test2 = new ArrayList<String>(Test);
        Test2.add("1");
        Test2.add("3");
        Test2.add("2");
        Test2.remove("3");
        System.out.println(Test2);

        List<String> Test3 = new Vector<String>(Test);
        System.out.println(Test3);
        List<String> Test4 = List.of(Test3.toString());
        System.out.println(Test4);
        // ArrayList vs. LinkedList
        // ArrayList는 데이터 적재는 느리지만, 데이터 접근이 빠름
        // LinkedList는 데이터 적재가 빠름, 데이터 접근이 ArrayList보다 느림

        // Vector vs. ArrayList
        // ArrayList가 Vector보다 늦게 출시됨.
        // Vector는 특정 메소들과 동기화, ArrayList는 동기화 되지 않음.
        //// Vector는 머티플 쓰레드 들 중 하나의 스레드만 하나의 메소드만 실행 가능함.(Thread Safe) 스레드들간 데이터 공유.
        //동기화는 쓰레드를 안전하게 하는 역할을 함.

        System.out.println("Operations");
        List<String> words = List.of("Apple","Bat","cat");
        List<String> wordsArrayList = new ArrayList<String>(words);
        wordsArrayList.add("Dog");
        System.out.println(wordsArrayList);
        wordsArrayList.add(2, "Ball");
        System.out.println(wordsArrayList);
        // List는 중복 값을 가질 수 있다.
        wordsArrayList.add("Ball");
        List<String> newList = List.of("Yark","Zebra");
        wordsArrayList.addAll(newList);
        wordsArrayList.set(5,"Fish");
        System.out.println(wordsArrayList);
        wordsArrayList.remove(2);
        System.out.println(wordsArrayList);
        wordsArrayList.remove("Dog");
        System.out.println(wordsArrayList);

        //ArrayList Loop
        for(int i=0; i < words.size(); i++) {
            System.out.println(words.get(i));
        }
        for(String word:words) {
            System.out.println(word);
        }
        Iterator wordsIterator = words.iterator();

        while(wordsIterator.hasNext()) {
            System.out.println(wordsIterator.next());
        }
        System.out.println("--");
        List<String> wordsAl = new ArrayList<String>(words);
        for(String word:words) {
            if (word.endsWith("at")) {
                System.out.println(word);
            }
        }
//        for(String word:wordsAl) {
//            if (word.endsWith("at")) {
//                words.remove(word);
//            }
//        }
        Iterator<String> iterator = wordsAl.iterator();
        while(iterator.hasNext()) {
            if(iterator.next().endsWith("at")) {
                iterator.remove();
            }
        }
        System.out.println(wordsAl);
        // Loop에서 ArrayList의 요소를 삭제하기 위해선 반복자(iterator)를 사용하는게 안전.
    }
}
