import java.util.Arrays;

class Solution {
    public String[] solution(String myString) {
         return Arrays.stream(myString.split("x"))
                .filter(it -> !it.isEmpty())
                .sorted()
                .toArray(String[]::new);
    }
}