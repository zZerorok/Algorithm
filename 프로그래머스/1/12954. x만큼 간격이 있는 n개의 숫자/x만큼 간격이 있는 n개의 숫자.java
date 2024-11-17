import java.util.stream.LongStream;
import java.util.Arrays;

class Solution {
    public long[] solution(int x, int n) {
        return LongStream.rangeClosed(1, n)
                .map(it -> x * it)
                .toArray();
    }
}