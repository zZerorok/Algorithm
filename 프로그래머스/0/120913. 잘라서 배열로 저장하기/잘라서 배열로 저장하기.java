import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        List<String> result = new ArrayList<>();
        int chunkCount = my_str.length() / n;
        int start = 0;
        int end = n;
        for (int i = 0; i < chunkCount; i++) {
            result.add(my_str.substring(start, end));
            start += n;
            end += n;
        }
        
        if (start < my_str.length()) {
            result.add(my_str.substring(start));
        }
        
        return result.toArray(new String[0]);
    }
}