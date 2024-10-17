class Solution {
    public String solution(String phone_number) {
        String[] strings = phone_number.split("");
        int index = strings.length - 4;

        StringBuffer answer = new StringBuffer();
        for (int i = 0; i < strings.length; i++) {
            if (i < index) {
                answer.append("*");
            } else {
                answer.append(strings[i]);
            }
        }

        return answer.toString();
    }
}