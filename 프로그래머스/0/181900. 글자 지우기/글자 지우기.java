import java.util.HashSet;
import java.util.Set;

class Solution {
    public String solution(String my_string, int[] indices) {
        Set<Integer> indexes = new HashSet<>();
        for (int index : indices) {
            indexes.add(index);
        }
        
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            if (!indexes.contains(i)) {
                builder.append(my_string.charAt(i));
            }
        }

        return builder.toString();
    }
}