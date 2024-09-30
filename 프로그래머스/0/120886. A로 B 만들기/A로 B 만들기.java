import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        char[] beforeCharArray = before.toCharArray();
        char[] afterCharArray = after.toCharArray();

        Arrays.sort(beforeCharArray);
        Arrays.sort(afterCharArray);

        if (Arrays.equals(beforeCharArray, afterCharArray)) {
            return 1;
        }
        return 0;
    }
}