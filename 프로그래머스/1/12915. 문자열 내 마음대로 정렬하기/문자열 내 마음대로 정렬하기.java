import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String[] solution(String[] strings, int n) {
        return Arrays.stream(strings)
                .sorted(Comparator.comparing((String it) -> it.charAt(n))
                        .thenComparing(it -> it))
                .toArray(String[]::new);
    }
}