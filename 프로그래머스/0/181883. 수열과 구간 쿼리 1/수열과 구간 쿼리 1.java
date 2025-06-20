import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] result = Arrays.copyOf(arr, arr.length);
        for (int[] query : queries) {
            int start = query[0];
            int end = query[1];

            for (int i = start; i <= end; i++) {
                result[i] += 1;
            }
        }

        return result;
    }
}