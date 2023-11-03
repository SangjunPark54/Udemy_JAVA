package udemy.section22;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String value1, String value2) {
        return Integer.compare(value1.length(),
                value2.length());
    }
}
public class _09_QueueInterface {
    /*
    원하는대로 정렬하고자 할때 사용
    Collection Interface를 확장하기때문에 Collection 메소드를 사용하면 됨.
     */
    //Comparator를 사용하여 우선 순위 정의가능


    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>(
                new StringLengthComparator());
        System.out.println(queue.poll());
//        queue.offer("Apple");
        queue.addAll(List.of("Zebra","Monkey","Cat"));
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        // Element의 우선 순위를 정할 수 있음.


    }
}
