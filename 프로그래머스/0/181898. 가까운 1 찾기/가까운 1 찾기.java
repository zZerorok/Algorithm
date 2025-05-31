import java.util.stream.IntStream;

class Solution {
    
    private final static int TARGET_NUMBER = 1;
    private final static int NOT_FOUND = -1;
    
    public int solution(int[] arr, int idx) {
        return IntStream.range(idx, arr.length)
                .filter(i -> arr[i] == TARGET_NUMBER)
                .findFirst()
                .orElse(NOT_FOUND);
    }
}
