class Solution {
    public int solution(int num, int k) {
        String stringNum = String.valueOf(num);
        if (stringNum.contains(String.valueOf(k))) {
            return stringNum.indexOf(String.valueOf(k)) + 1;
        }
        return -1;
    }
}