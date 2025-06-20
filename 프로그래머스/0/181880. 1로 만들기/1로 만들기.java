class Solution {
    public int solution(int[] num_list) {
       int count = 0;
        for (int number : num_list) {
            while (number > 1) {
                number = number / 2;
                count += 1;
            }
        }
        return count;
    }
}