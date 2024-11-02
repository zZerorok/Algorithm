import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int answer = citations.length;

        for (int citation : citations) {
            if (citation >= answer) {
                break;
            }
            answer -= 1;
        }

        return answer;
    }
}