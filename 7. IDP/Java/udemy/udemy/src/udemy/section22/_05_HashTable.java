package udemy.section22;

public class _05_HashTable {
    /*
    배열과 비슷하게 고정된 위치들과 LinkedList의 장점을 합쳐 처리

    버킷(인덱스)의 고정하여 주소로 사용
    해싱 함수를 사용하여 LinkedList처럼 저장
    데이터 / 전체 주소 수 = 나머지를 버킷 주소로 사용

    인덱스 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | 11 | 12

    10 / 13 = 0 /10 = 10인덱스에 저장

    데이터를 쉽게 삽입하고 조회하고, 제거하기 쉬움.
    LinkedList보단 느리지만, Array보단 빠름.

    hashcode() 를 이용하여 구현.

     */
}
