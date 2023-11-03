package udemy.section22;

import java.util.HashMap;
import java.util.Map;

public class _11_MapRunner {
    // "This is a great thing"
    public static void main(String[] args) {
        String str = "This is awesome occasion. This has never happened before.";

        // 글자가 몇개인지
        // 몇번 반복 되는지
        Map<Character, Integer> occurances = new HashMap<>();

        char[] characters = str.toCharArray();
        for(char character:characters) {
            //get char
            //if not there, init to 1
            Integer integer = occurances.get(character);
            if (integer == null) {
                occurances.put(character, 1);
                //if it is there, increase count
            } else {
                occurances.put(character, integer + 1);
            }
            System.out.println(occurances);
        }
        Map<String, Integer> stringOccurances = new HashMap<>();
        String[] words = str.split(" ");
        for(String word:words) {
            //get char
            //if not there, init to 1
            Integer integer = stringOccurances.get(word);
            if(integer==null) {
                stringOccurances.put(word, 1);
                //if it is there, increase count
            } else {
                stringOccurances.put(word, integer + 1);
            }
            System.out.println(stringOccurances);
        }
    }
}
