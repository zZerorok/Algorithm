class Solution {
    public String solution(String s) {
       StringBuilder answer = new StringBuilder();

        // 연속된 공백을 처리하여 문자열 배열로 분리
        String[] split = s.split("\\s+");

        for (String string : split) {
            if (!string.isEmpty()) {  // 빈 문자열을 걸러내고 처리
                String firstString = string.substring(0, 1).toUpperCase();  // 첫 번째 문자 대문자
                String remainString = string.substring(1).toLowerCase();  // 나머지 소문자
                answer.append(firstString).append(remainString).append(" ");
            }
        }

        // 불필요한 끝 공백을 제거하고 반환
        return answer.toString().trim();
    }
}