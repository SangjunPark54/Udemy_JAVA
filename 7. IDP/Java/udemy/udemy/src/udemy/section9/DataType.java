package udemy.section9;

public class DataType {
    /*
    - 정수 Integer : byte(1 Byte), short(2), int(4), long(8)
        Byte.SIZE; Byte.MAX_VALUE; Byte.MIN_VALUE; (-128 ~ 127)
        * 모든 정수는 default로 int 값을 가짐.
          long l = 1000000l;
          int i = 1000;
        * 큰 타입을 작은 타입에 넣을 수 없음
        * 단, 형변환을 통해 넣을 수 있음, 데이터 값은 유실 됨.
          (Explicit 변환) i = (int) l
        * 작은 타입은 큰 타입으로 변경할 수 있음(데이터 유실이 없기 때문)
          (implicit 변환) l = i
        * 연산자 : +, -, /, *, $, %, ++, --
    - 실수 Floating Point : float, double
    - Boolean : boolean
    - Character :char
     */
}
