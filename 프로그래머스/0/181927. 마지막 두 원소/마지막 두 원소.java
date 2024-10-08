class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }
        
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