import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String[] solution(String myStr) {
        String[] split = myStr.split("[abc]");
        
        List<String> answer = new ArrayList<>();
        for (String string : split) {
            if (!string.isEmpty()) {
                answer.add(string);
            }
        }

        if (answer.isEmpty()) {
            return new String[]{"EMPTY"};
        }

        return answer.stream().toArray(String[]::new);
    }
}