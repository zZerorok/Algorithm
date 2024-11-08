class Solution {
    public String solution(String rsp) {
        StringBuilder answer = new StringBuilder();
        String[] split = rsp.split("");
        for (String move : split) {
            if (move.equals("0")) {
                answer.append("5");
            }

            if (move.equals("2")) {
                answer.append("0");
            }

            if (move.equals("5")) {
                answer.append("2");
            }
        }

        return answer.toString();
    }
}