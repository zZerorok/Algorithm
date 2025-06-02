import java.util.List;

class Solution {
    
    private static final List<String> ALIEN_AGES = List.of(
            "a", "b", "c", "d", "e", "f", "g", "h", "i", "j"
    );
    
    public String solution(int age) {
        StringBuilder builder = new StringBuilder();
        String[] ageStrings = String.valueOf(age).split("");
        for (String ageString : ageStrings) {
            builder.append(ALIEN_AGES.get(Integer.parseInt(ageString)));
        }
        return builder.toString();
    }
}