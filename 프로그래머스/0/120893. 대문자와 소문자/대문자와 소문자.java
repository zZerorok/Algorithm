class Solution {
    public String solution(String my_string) {
        StringBuilder string = new StringBuilder();
        String[] split = my_string.split("");
        
        for (String value : split) {
            if (value.equals(value.toLowerCase())) {
                string.append(value.toUpperCase());
            } else {
                string.append(value.toLowerCase());
            } 
        }

        return string.toString();
    }
}