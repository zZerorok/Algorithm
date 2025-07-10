class Solution {

    public int solution(int[] array) {
        int count = 0;
        for (int number : array) {
            String value = Integer.toString(number);
            for (char ch : value.toCharArray()) {
                if (ch == '7') {
                    count += 1;
                }
            }
        }
        return count;
    }
}
