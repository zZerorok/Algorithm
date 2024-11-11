import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String[] solution(String myStr) {
        String replaceAll = myStr.replaceAll("[abc]", ",");
        
        String[] split = replaceAll.split(",");
        if (split.length == 0) {
            return new String[]{"EMPTY"};
        }
        
        List<String> answer = new ArrayList<>();
        for (String string : split) {
            if (!string.isEmpty()) {
                answer.add(string);
            }
        }
        
        return answer.stream().toArray(String[]::new);
    }
}