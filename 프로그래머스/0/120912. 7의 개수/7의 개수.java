class Solution {

    private static final String TARGET = "7";

    public int solution(int[] array) {
        int count = 0;
        for (int number : array) {
            String[] split = String.valueOf(number).split("");
            for (String current : split) {
                if (current.equals(TARGET)) {
                    count += 1;
                }
            }
        }
        return count;
    }
}
