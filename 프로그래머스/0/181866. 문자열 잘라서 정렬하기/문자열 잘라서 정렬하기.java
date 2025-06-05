import java.util.*;

class Solution {
    public String[] solution(String myString) {
         String[] split = myString.split("x");
        List<String> list = new ArrayList<>();

        for (String current : split) {
            if (!current.isEmpty()) {
                list.add(current);
            }
        }
        
        Collections.sort(list);
        return list.toArray(new String[0]);
    }
}