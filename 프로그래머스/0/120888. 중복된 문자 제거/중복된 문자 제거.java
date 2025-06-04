import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public String solution(String my_string) {
        StringBuilder builder = new StringBuilder();
        Set<String> uniqueStrings = new LinkedHashSet<>(List.of(my_string.split("")));
        for (String uniqueString : uniqueStrings) {
            builder.append(uniqueString);
        }
        return builder.toString();
    }
}