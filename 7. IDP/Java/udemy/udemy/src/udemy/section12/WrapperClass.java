package udemy.section12;

import java.time.LocalDate;

public class WrapperClass {
    /*
    기본 변수 타입(boolean, byte, char, double, float, int, long, short)에 상응하는
    클래스가 있다.
    이 클래스 값 들을 싸고 있는 랩과 같아 Wrapper 클래스라고 함.
      ex) int의 래퍼 클래스는 Integer.
          char의 래퍼 클래스는 Charater
    래퍼 클래스는 추가적인 옵션을 다양하게 제공.
    1.  ex) Integer hundred = Integer.valueOf("100");와 같이 Integer에 String 값을 사용
    2. 유틸리티 메소드를 제공.
        ex) Float floatWrapper = Float.valueOf(57.0f);
            int floatToint = floatWrapper.intValue(); //57
        형변환을 통해 Float Data를 정수로 받기 위해
    3. 기본 값들은 컬렉션에 저장
        추가 대상이 꼭 객체여야 하고 래퍼 클래스는 이 기본값에 객체를 제공하는 역할
     */
    /*
    Wrapper클래스 생성
     */
    /*
    public static void WrapperClass(){
        int i = 5;
        int interger;
        // Constructor 사용
        Integer integer = new Integer(5);
        Integer interger1 = new Integer(5);

        // ValueOf 메소드 사용
                Integer integer = Integer.valueOf(5);
    Integer i1 = new Integer(5);
    Integer i2 = new Integer(5);
       새로운 값을 생성(Heap)
    Integer i3 = Integer.valueOf(5);
    Integer i4 = Integer.valueOf(5);
        valueOf : 다른 객체에서 동일한 값을 찾는다면 동일한 값을 사용
    i1 == i2; // false
    i3 == i4 // true

    AutoBoxing
     : 기본값을 이용해 코드를 입력, 컴파일러가 이것을 래퍼로 변환
        Interger seven = Integer.valueOf(*)7);
        Integer seven = 7; //오토박싱
        두개는 동일한 코드
        Integer seven2 = 7;
        seven == seven2 // true 동일값 (래퍼)
     > Syntathic Sugar

     : 불변성
         Integer.MAX_VALUE
         Integer.MIN_VALUE
         Integer.SIZE
         Integer.BYTES

     */


}


