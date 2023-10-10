package udemy.section13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArrayMagic {
    /**
     * This method finds and returns the second largest element in the given array.
     *
     * @param array the array in which to find the second largest element
     * @return the second largest element in the array
     */
    public boolean doesHaveElementGreaterThan(int[] array, int number) {
//        if (array.length == 0) {
//            return false;
//        }
        for (int value: array) {
            if (value > number) {
                return true;
            }
        }
        return false;
    }
    public int findSecondLargestElement(int[] array) {
        if(array.length == 0) {
            return -1;
        }
        // 정수 점 최소 값
        int largestElement = Integer.MIN_VALUE;

        int secondLargestElement = Integer.MIN_VALUE;


        for (int value: array) {
            if(value > largestElement) {
                secondLargestElement = largestElement;
                largestElement = value;
            } else if (value > secondLargestElement
                    && value != largestElement) {
                secondLargestElement = value;
            }
        }
        if (secondLargestElement == Integer.MIN_VALUE) {
            return -1;
        }
        return secondLargestElement;
    }
    public boolean isSorted(int[] array) {
        // 배열이 비어 있거나 요소가 하나만 있다면 그런 배열들은 정렬된 것으로 간주되므로 메서드는 true를 리턴해야 합니다.
        // 배열에 음수와 0이 포함될 수 있습니다.
        // 배열에 중복된 요소들이 포함될 수 있습니다.
        if(array.length <= 1) {
            return true;
        }
        // 1,2,3,4,

        for (int i = 0; i < array.length -1; i++) {
            if(array[i+1] < array[i]) {
                return false;
            }
        }
        return true;
    }

    public int[] reverseArray(int[] array) {
        //정수로 된 배열을 받고, 입력된 배열이 담겨 있으나 순서가 역순인 배열을 리턴
        //포인터 2개를 정의합니다. 이름을 각각 start와 end라고 합니다.
        // start포인터는 배열의 첫 번째 요소를 지시해야 하고 end포인터는 마지막 요소를 지시
        //역순으로 된 요소들을 저장하기 위해 새로운 배열을 만듭니다. 그 배열을 reversedArray
        //입력된 배열의 end인덱스에서 요소를 reversedArray의 start인덱스에 복사해 넣습니다.
        //입력된 배열의 start 인덱스에서 요소를 복사하여 reversedArray의 end인덱스에 넣습니다.
        //배열의 끝을 향해start포인터를 한 단계 이동합니다.
        //배열의 시작을 향해 end포인터를 한 단계 이동합니다

        //입력된 배열이 비어 있으면(즉 배열의 길이가 0이면) 메서드는 빈 배열을 리턴해야 합니다.
        //입력된 배열에 요소가 하나뿐이면 메서드는 다시 그 배열을 리턴해야 합니다.
        if(array.length <= 1) {
            return array;
        }
        // 10 , 20 , 30 , 40
        // start = 10
        // end = 40

        int start = 0;
        int end = array.length -1;

        int[] reversedArray = new int[array.length];

        while (start < end) {
            reversedArray[start] = array[end];
            reversedArray[end] = array[start];
            start ++;
            end --;
        }
        return reversedArray;
    }
}
