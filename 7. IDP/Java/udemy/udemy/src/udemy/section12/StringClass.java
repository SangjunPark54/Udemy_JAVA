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
    }

}
