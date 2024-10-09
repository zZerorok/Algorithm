import java.util.Arrays;

class Solution {
    public int solution(String my_string) {
        String stringNum = my_string.replaceAll("[^0-9]", "");
        
        return Arrays.stream(stringNum.split(""))
                .mapToInt(Integer::parseInt)
                .sum();
    }
}