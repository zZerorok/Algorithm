import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        String[] split = s.split("");
        Arrays.sort(split, Collections.reverseOrder());

        StringBuilder answer = new StringBuilder();
        for (String string : split) {
            answer.append(string);
        }

        return answer.toString();
    }
}