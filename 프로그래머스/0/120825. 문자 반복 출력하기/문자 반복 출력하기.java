
class Solution {
    public String solution(String my_string, int n) {
        StringBuilder stringResult = new StringBuilder();
        String[] split = my_string.split("");

        for (String value : split) {
            stringResult.append(value.repeat(n));
        }
        
        return stringResult.toString();
    }
}