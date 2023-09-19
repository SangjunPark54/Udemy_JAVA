package udemy.section12;

public class StringClass {
    // 1. 스트링 클래스
    // "TEST"는 스트링 클래스의 인스턴스 이다.
    // 스트링은 생성자가 필요 없다.
    // 스트링의 값은 바꿀 수 없다.
    public static void main(String[] args) {
        System.out.println("TEST".length());
        String str = "TEST";
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(3));
        String bigger = "This is a lot of text";
        System.out.println(bigger.substring(5,13));
        String bigger1 = "This is a lot of text again";
        System.out.println(bigger1.length());
        for (int i = 0; i < bigger1.length(); i++) {
            System.out.println(bigger1.charAt(i));
        }
        System.out.println(bigger1.indexOf("lot"));
        System.out.println(bigger1.indexOf('i'));
        System.out.println(bigger1.lastIndexOf('i'));
        System.out.println(bigger1.contains("again"));
        System.out.println(bigger1.startsWith("This"));
        System.out.println(bigger1.endsWith("again"));
        System.out.println(bigger1.isEmpty());
        System.out.println(bigger1.equals("This is a lot of text again"));

        // String의 값은 절대 바꿀 수 없다.
        String str1 = "Seanpark";
        str1.concat("Sangjun Park");
        System.out.println(str1);
        // concat은 스트링을 합쳤다고 해서 str1의 값을 바꿀 수 없음.
        // 그저 다른 스트링의 값을 줌.
        // str1.concat은 새로운 String을 생성하는 것.
        String anotherString = str1.concat(" Sangjun Park");
        System.out.println(anotherString);
        System.out.println(str1);

        String string2 = anotherString.concat(".");
        System.out.println(string2);
        System.out.println(str1);
        System.out.println(anotherString);

        String STR = "Sean park.";
        System.out.println(STR.toUpperCase());
        System.out.println(STR.toLowerCase());
        System.out.println(STR.trim());

        // String Concanation
        int i = 1 + 2; // 3;
        String Value = "1" + "2"; //12;
        System.out.println(1+2+"3"); //33
        System.out.println("1"+2+3); //123
        // 자바에서 표현식 검사는 왼쪽에서 오른쪽으로 진행,
        // String + int는 모두 String으로 인식 된다.
        // int + String 은 int연산 후 String을 받기 때문에 1+2+"3" = 33으로 출력
        System.out.println(String.join(",","1","2","3")); // "1,2,3"
        // 첫번재 캐릭터를 다음 문자열 사이에 끼워 넣는다.
        System.out.println(STR.replace("park", "Park"));
        // StringBuffer
        String Buffer = "123" + "123" + "1234" + "123456";
        // 각각 4개의 객체가 생성됨
        // 이런 경우를 위해 스트링 버퍼 클래스가가 제공됨
        StringBuffer sb = new StringBuffer("TEST");
        sb.append(" 123456");
        System.out.println(sb);
        /*
         스트링 버퍼는 객체의 값을 변경 한다.
         스트링 버퍼는 동기화된 클래스, 두개의 스레드가 동시에 엑세스 불가.
         스트링빌더를 사용 멀티스레딩이 가능. = 패널티가 존재(속도가 느려질 수 있음)
         */
        // 스트링빌더
        StringBuilder SB = new StringBuilder("test");
        // 객체와 인스턴스를 많이 사용하는 경우 스트링빌더나 스트링버퍼를 사용해야함.
        // 멀티 스레딩의 이슈가 존재할 경우 빌더를 사용


    }

}
