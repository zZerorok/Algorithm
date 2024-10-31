import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        String[] words = my_string.trim()
                    .replaceAll("\\s+", " ")
                    .split(" ");
            
        return Arrays.stream(words).toArray(String[]::new);
    }
}