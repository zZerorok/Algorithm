import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
         if (arr.length == 1) {
            return new int[]{-1};
        }
        
        int min = Arrays.stream(arr).min().getAsInt();
        int[] answer = new int[arr.length - 1];
        int index = 0;
        for (int number : arr) {
            if (number != min) {
                answer[index++] = number;
            }
        }
        return answer;
    }
}