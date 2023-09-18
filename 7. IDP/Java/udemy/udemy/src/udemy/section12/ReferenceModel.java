package udemy.section12;

public class ReferenceModel {
    public class Planet {
        Planet jupiter = new Planet();
        // jupiter는 참조 변수이고, Planet이 참조 타입이다.
        int i = 5;
        // i가 기본 변수 이고, int가 기본 타입이다.

        /*
        우선 참조 변수와 기본 변수가 메모리에 어떻게 저장는지
        기본 변수에 값을 매겼을 때 또는 하나의 값을 다른 하나에 적용했을 어떤 일이 발생하는지
        그것들이 어떻게 설정되는지
        자바에 있는 몇 가지 참조 변수
        - 스트링이, 래퍼 클래스라고 하는 클래스 묶음, LocalDate와 LocalDateTime

        참조 타입이란?
         - 간단하게 생성하는 모든 클래스가 참조 타입.
          - 사전 정의된 클래스 String, BigDecimal,
          - 인스턴스 (jupiter)는 참조 변수
        기본 변수와 참조 변수의 차이?
         - 참조 변수의 메모리 적재
          :  Animal dog = new Animal(12);
          : Animal Cat = new Animal(15);
          위를 통해 인스턴스를 생성
          새로운 객체가 적재되는 곳은 Heap에 저장.
          모든 새로운 객체는 Heap에 저장되는데, Heap은 글로벌로 공유되는 기본 저장소.
          : int i = 5;
          기본 변수는 생성될 때 Stack에 저장.
          각각의 메소드들은 별도의 스택을 가지고 있다.

          Stack                    |      Heap
          Location Value variable  |  location object
          A         5       i      |      1A   Animal12
          B         1C      cat    |      1B
          C         1A      dog    |      1C   Animal15
          D         1C    nothing  |      1D
          기본 변수 > Stack에 값을 저장
          참조 변수 > Stack에 Heap 메모리의 위치정보를 저장 > 실제 값은 Heap에 저장됨.

         */
        public class Animal {
            String id;
            Animal(String id) {
                this.id = id;
            }
            Animal nothing; // 참조 변수 초기화. 값을 할당하지 않음(null)
            // nothing = cat;
            // nothing에 cat 값을 할당. 메모리 정보는 변화하지 않음.
            // 실제 값이 저장되는 것이 아니라, 기존에 존재하던 cat의 값을 가진 메모리 위치가 저장
            // nothing에 저장 (1C)
            // cat과 nothing의 값을 조회해보면 모두 동일한 Animal15가 조회
            // nothing = dog, dog의 위치정보가 nothing에 저장 (1A)
            // int j = i
            // 새로운 메모리 위치에 j값을 i의 값 5로 저장
            // 참조 변수를 비교할때 (==) 비교하는 것은 값이 아니라 객체 이다.
            // 객체가 다르면 값이 같더라도 같은 걸로 인식하지 않음.
        }

    }
}
