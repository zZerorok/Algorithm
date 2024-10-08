import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = Arrays.copyOf(num_list, num_list.length + 1);
        
        int lastIndexNum = num_list[num_list.length - 1];
        int beforeLastIndexNum = num_list[num_list.length - 2];
        
        if (lastIndexNum > beforeLastIndexNum) {
            answer[num_list.length] = lastIndexNum - beforeLastIndexNum;
        }

        if (lastIndexNum <= beforeLastIndexNum) {
            answer[num_list.length] = lastIndexNum * 2;
        }
    
        return answer;
    }
}