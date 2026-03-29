package InterviewQuestions.CodingProblems;

import java.util.HashMap;

// 1. Given a string, find the first non-repeating character and return it. If all characters repeat, return '\0' (null character).
public class Problem0 {
    public static char helperFn(String s){
        HashMap<Character, Integer> mp = new HashMap<>();

        for (char ch : s.toCharArray()) {
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }

        for(char ch: s.toCharArray()){
            if(mp.get(ch) == 1){
                return ch;
            }
        }

        return '\0';
    }
    public static void main(String[] args) {
        String s = "aabbccdd";

        System.out.println(helperFn(s));
    }
}
