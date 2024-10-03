import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string, int n) {
        return Arrays.stream(my_string.split(""))
                .map(string -> string.repeat(n))
                .collect(Collectors.joining());
    }
}