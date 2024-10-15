import java.util.*;

public class Solution {
    public int solution(int n) {
        String[] split = String.valueOf(n).split("");
        
        return Arrays.stream(split).mapToInt(Integer::parseInt).sum();
    }
}