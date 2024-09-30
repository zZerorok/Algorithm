import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        
        int[] beforeArray = Arrays.stream(getASCII(before)).sorted().toArray();
        int[] afterArray = Arrays.stream(getASCII(after)).sorted().toArray();
        
       if (Arrays.equals(beforeArray, afterArray)) {
            return 1;
        } else {
            return 0;
        }
    }
    
    public int[] getASCII(String string) {
        int[] codes = new int[string.length()];

        for (int i = 0; i < string.length(); i++) {
            int code = string.charAt(i);
            codes[i] = code;
        }

        return codes;
    }
}