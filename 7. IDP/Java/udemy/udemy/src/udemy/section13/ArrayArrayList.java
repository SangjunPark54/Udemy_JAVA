package udemy.section13;

public class ArrayArrayList {
//    int mark1 = 100;
//    int mark2 = 75;
//    int mark3 = 60;
//    int sum = mark1 + mark2 + mark3;
//    int mark4 = 56;
//    int sum2 = mark1 + mark2 + mark3 + mark4;


    public static void main(String[] args) {
        int[] marks = {75, 60, 56};
        int[] marks2 ={1,2,3,4,5};
        int[] marks3 = new int[5]; //Value 없이 배열 크기만 정의 {0,0,0,0,0}
//        int mark3 [0] = {10};
        int sum =0;
        for(int mark:marks) {
            sum = sum + mark;
        }
        System.out.println(sum);
        System.out.println(marks[0]);

        System.out.println(marks3.length);

        int[] arrays = {10, 20, 30, 40, 55, 30};
        int sum1 = 0;
        for(int array:arrays) {
            sum1 = sum1 + array;
            }
        System.out.println(sum1);

        int[] pays = { 100000, 20000, 30000, 40000};
        int paysum = 0;
        for(int pay:pays) {
            paysum = paysum + pay;
        }
        System.out.println(paysum);
    }
    /*
    ArrayList
    - ArrayList arrayList = new ArrayList();
      arrayList.add("Apple");
      arrayList.add("Bat");
      arrayList.add("Cat");
      arrayList.remove("Apple");
      타입을 명시하는게 좋음
      ArrayList<String> items = new ArrayList<String>();
       # <> Generic :
     */
}
