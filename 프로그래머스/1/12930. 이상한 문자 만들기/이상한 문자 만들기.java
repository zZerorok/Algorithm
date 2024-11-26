class Solution {
    public String solution(String s) {
        String[] words = s.split(" ", -1);
        StringBuilder builder = new StringBuilder();

        for (int index = 0; index < words.length; index++) {
            String word = words[index];

            for (int i = 0; i < word.length(); i++) {
                char current = word.charAt(i);
                if (i % 2 == 0) {
                    builder.append(Character.toUpperCase(current));
                } else {
                    builder.append(Character.toLowerCase(current));
                }
            }

            if (index < words.length - 1) {
                builder.append(" ");
            }
        }
        return builder.toString();
    }
}