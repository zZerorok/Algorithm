import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int number) {
         return IntStream.rangeClosed(0 , number)
                .filter(num -> num % 2 != 0)
                .toArray();
    }
}