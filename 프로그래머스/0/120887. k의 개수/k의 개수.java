import java.util.stream.IntStream;

class Solution {
    public int solution(int i, int j, int k) {
         return (int) IntStream.rangeClosed(i, j)
                .flatMap(num -> String.valueOf(num).chars())
                .filter(ch -> ch == (k + '0'))
                .count();
    }
}