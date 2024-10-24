class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        if (11 <= num_list.length) {
            for (int num : num_list) {
                answer += num;
            }
        } else {
            answer = 1;
            for (int num : num_list) {
                answer *= num;
            }
        }
        
        return answer;
    }
}