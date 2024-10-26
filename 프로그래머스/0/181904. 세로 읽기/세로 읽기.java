import java.util.ArrayList;
import java.util.List;

class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder builder = new StringBuilder();

        List<String> rows = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i++) {
            builder.append(my_string.charAt(i));

            if ((i + 1) % m == 0) {
                rows.add(builder.toString());

                builder.setLength(0);
            }
        }
        
        builder.setLength(0);

        for (int i = 0; i < rows.size(); i++) {
             builder.append(rows.get(i).charAt(c - 1));
        }
        
        return builder.toString();
    }
}