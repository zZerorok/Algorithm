class Solution {
    public String solution(String my_string, int[] index_list) {
        StringBuilder answer = new StringBuilder();
        String[] split = my_string.split("");

        for (int index : index_list) {
            answer.append(split[index]);
        }

        return answer.toString();
    }
}