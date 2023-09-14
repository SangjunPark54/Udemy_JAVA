package udemy.section10;

public class puzzle {
    public static void main(String[] args) {
        puzzle2();
    }

    private static void puzzle1() {
        int k = 15;
        if (k > 20) {
            System.out.println(1);
        } else if (k > 10) {
            System.out.println(2);
        } else if (k < 20) {
            System.out.println(3);
        } else {
            System.out.println(4);
        }
    }
    private static void puzzle1swtich() {
            int number = 2;
            switch (number) {
                case 1:
                    System.out.println(1);
                case 2:
                    System.out.println(2);
                case 3:
                case 4:
                    System.out.println(3);
                    break;
                    // fall through
                default:
                    // switch문 제일 처음에 정의할 수 있음
                    // char, int, byte, short, enum, string에서만 switch에서만 사용
                    // case에 operation을 넣을 수 없음. case 5: 만 가능
                    System.out.println("default");
            }
        }

// 조건이 참이 되면 뒤의 조건은 실행되지 않는다.
    private static void puzzle2() {
        int l = 15;
        if (l < 20) {
            System.out.println("l<20"); //
        }
        if (l > 20) {
            System.out.println("l>20");
        } else System.out.println("Who am I?"); //
        // 위 2개의 if는 서로 독립적인 문이기 때문에 2개의 로직이 실행됨.
        // 위 2개의 if는 서로 연결되있지 않음.
        // 블럭을 사용하여 구분 지어주는게 좋음.
    }
    private static void puzzle3 () {
        int m = 15;

        if (m > 20) {
            if (m < 20) {
                System.out.println("m>20");
            } else {
                System.out.println("Who am I?");
            }
        }
    }
    private static void puzzle4() {
        int x1 = 0;
        //Condition in if should always be boolean
        //if(x1) {} // COMPILER ERROR
        //if(x1=0) {} / COMPILER ERROR/ == instead of = // = assignment // == is 비교연산자
    }
}
