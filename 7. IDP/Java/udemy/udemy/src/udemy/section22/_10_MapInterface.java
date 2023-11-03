package udemy.section22;

import java.util.*;

public class _10_MapInterface {
    // Key - Value 쌍으로 저장
    // {["key1",value1]}
    // Collection의 메소드가 map에서는 사용하지 못함.
    // HashmMap vs HashTable 연산에서 차이는 없으나, HashTable은 벡터와 같이 동기화 됨.
    // 해시맵은 Key를 null에 저장, HashTable은 key 값으로 null 사용 불가
    // 해시테이블은 해시맵에 비해 느림
    // TreeMap의 구조는 tree에 기반(정렬)
    // TreeMap은 NavigateMap을 구현하는데 사용됨
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("A",3,"B",5,"Z",10);
        System.out.println(map);
//        System.out.println(map.put("R",1));// 데이터 추가 불가
        System.out.println(map.get("Z"));
        map.isEmpty();
        map.containsKey("F");
        map.containsValue(3);
        System.out.println(map.keySet());
        System.out.println(map.values());
        //해쉬맵 생성
        Map<String, Integer> hashmap = new HashMap<>(map);
        System.out.println(hashmap);
        hashmap.put("F",5); // 추가
        System.out.println(hashmap);
        hashmap.put("Z",11); //기존 값 업데이트
        System.out.println(hashmap);

        HashMap<String, Integer> hashmap1 = new HashMap<>();
        hashmap1.put("Z",5);
        hashmap1.put("A",15);
        hashmap1.put("F",25);
        hashmap1.put("L",250);
        System.out.println(hashmap1);
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("L",250);
        linkedHashMap.put("F",25);
        linkedHashMap.put("A",15);
        linkedHashMap.put("Z",5);
        System.out.println(linkedHashMap);
        TreeMap<String,Integer> treeMap = new TreeMap<>();
        treeMap.put("L",250);
        treeMap.put("F",25);
        treeMap.put("B",25);
        treeMap.put("G",25);
        treeMap.put("A",15);
        treeMap.put("Z",5);
        System.out.println(treeMap);
        // "This is a great thing" 
        System.out.println(treeMap.higherKey("B")); // >
        System.out.println(treeMap.ceilingKey("B")); // =>
        System.out.println(treeMap.lowerKey("B")); // <
        System.out.println(treeMap.floorKey("B")); // =<
    }

}
