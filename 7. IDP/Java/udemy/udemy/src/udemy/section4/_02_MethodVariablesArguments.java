package udemy.section4;

public class _02_MethodVariablesArguments {
    /*
    ReturnType nameofMethod(ArgumentsType argumentName) {
    // What do we want to do in the method?
    }
     */
//    void sayHelloWorld(int noOfTimes) {
//        //Body of the method
//        System.out.println(noOfTimes);
//    }
    static void sayHelloWorld(int noOfTimes) {
        // 지정된 횟수만큼 반복해서 "Hello, World!" 출력
        for (int i = 1; i <= noOfTimes; i++) {
            System.out.println("Hello, World!("+i+"}");
        }
    }
    public static void main(String[] args) {
        // 메소드를 호출하여 3번 "Hello, World!" 출력
        sayHelloWorld(3);
    }
}
