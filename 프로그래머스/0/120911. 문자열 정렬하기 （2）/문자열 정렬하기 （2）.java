import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        char[] chars = my_string.toLowerCase().toCharArray();
        Arrays.sort(chars);

        StringBuilder answer = new StringBuilder();
        for (char current : chars) {
            answer.append(current);
        }

        return answer.toString();
    }
}