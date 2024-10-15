import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int k) {
        if (k % 2 == 1) {
            return Arrays.stream(arr).map(number -> number * k).toArray();
        } else {
            return Arrays.stream(arr).map(number -> number + k).toArray();
        }
    }
}