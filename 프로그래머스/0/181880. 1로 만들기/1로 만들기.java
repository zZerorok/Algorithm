class Solution {
    public int solution(int[] num_list) {
       int count = 0;
        for (int number : num_list) {
            while (number > 1) {
                if (number % 2 == 0) {
                    number = number / 2;
                } else {
                    number = (number - 1) / 2;
                }

                count += 1;
            }
        }
        return count;
    }
}