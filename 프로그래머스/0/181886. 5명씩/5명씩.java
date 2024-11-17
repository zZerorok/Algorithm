import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public String[] solution(String[] names) {
       return IntStream.range(0, names.length)
                .filter(index -> index % 5 == 0)
                .mapToObj(index -> names[index])
                .toArray(String[]::new);
    }
}