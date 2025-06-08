import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int solution(String[] strArr) {
        return Arrays.stream(strArr)
                .collect(Collectors.groupingBy(String::length, Collectors.counting()))
                .values().stream()
                .mapToInt(Long::intValue)
                .max()
                .orElse(0);
    }
}