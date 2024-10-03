class Solution {
    public int solution(String[] s1, String[] s2) {
        int count = 0;

        for (String firstString : s1) {
            for (String secondString : s2) {
                if (firstString.equals(secondString)) {
                    count++;
                }
            }
        }

        return count;
    }
}