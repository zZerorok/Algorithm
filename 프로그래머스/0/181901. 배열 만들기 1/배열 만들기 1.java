import java.util.Arrays;
import java.util.stream.IntStream;


class Solution {
    public int[] solution(int n, int k) {
       return IntStream.rangeClosed(1, n)
                .filter(num -> (num * k) <= n)
                .map(num -> num * k)
                .toArray();
    }
}