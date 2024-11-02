class Solution {
    public String solution(int[] numLog) {
        StringBuilder answer = new StringBuilder();
        
        for (int i = 1; i < numLog.length; i++) {
            int result = 0;
            result = numLog[i] - numLog[i - 1];
            if (result == 1) {
                answer.append("w");
            } else if (result == -1) {
                answer.append("s");
            } else if (result == 10) {
                answer.append("d");
            } else if (result == -10) {
                answer.append("a");
            }
        }

        return answer.toString();
    }
}