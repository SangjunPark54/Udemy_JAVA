package udemy.pc;

import java.util.ArrayList;
import java.util.List;

public class NumberMagic {

    /**
     * This method returns all factors of a given number in an ArrayList.
     *
     * @param number the number to find factors of
     * @return a List of factors of the number
     */
    public List<Integer> determineAllFactors(int number) {
/*
입력 인수인 정수 number를 받습니다.
 number의 모든 약수를 계산 number를 다른 숫자(가령 divisor)로 나머지 연산을 한 결과가 0과 같으면 divisor는 number의 약수
 List<Integer> 형태로 리턴
 number의 약수인 모든 양수와 1, 그리고 number자체가 포함
 만일 number가 0 또는 음수라면 이 메서드는 빈 리스트를 리턴
 */
//        ArrayList<Integer> nm = new ArrayList<Integer>();
        List<Integer> nm = new ArrayList<Integer>();
        // edge case
        if(number <= 0) {
//            return null;
            return nm;
        }
        // 6 (1,2 ,3, 6)
        for(int i = 1; i <= number; i++) {
            if( number % i == 0 ) {
                nm.add(i);
            }
        }
        return nm;
    }
    public List<Integer> determineMultiples(int number, int limit) {
        /*
        지정된 한계 안에서 주어진 숫자의 배수들로 된 리스트를 리턴
        메서드는 정수 인수 2개를 받습니다.
            number : 배수를 구할 숫자
            limit : 배수의 상방 한계
        메서드는 limit 미만에서 주어진 number의 모든 배수가 포함된 List<Integer>를 리턴해야 합니다.
        만일 number또는 limit가 0보다 작거나 같다면 메서드는 빈 리스트를 리턴해야 합니다.
         */
        List<Integer> factors = new ArrayList<Integer>();
        if (number > limit || number <= 0) {
            return factors;
        }
            for (int i = 1; i < limit; i++) {
                if (number * i < limit) {
                    factors.add(number * i);
                }
            }
        return factors;
    }

    public static void main(String[] args) {
        NumberMagic test = new NumberMagic();
        System.out.println(test.determineAllFactors(5));
        NumberMagic E34 = new NumberMagic();
        System.out.println(E34.determineMultiples(21,20));
    }
}