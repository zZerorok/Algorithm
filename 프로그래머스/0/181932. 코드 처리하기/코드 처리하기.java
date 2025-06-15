class Solution {
    public String solution(String code) {
        StringBuilder result = new StringBuilder();
        String[] codes = code.split("");
        String mode = "0";
        for (int i = 0; i < code.length(); i++) {

            if (codes[i].equals("1")) {
                if (mode.equals("0")) {
                    mode = "1";
                } else {
                    mode = "0";
                }
            } else {
                if (mode.equals("0") && (i % 2 == 0)) {
                    result.append(codes[i]);
                }

                if (mode.equals("1") && (i % 2 != 0)) {
                    result.append(codes[i]);
                }
            }
        }

        if (result.toString().isEmpty()) {
            return "EMPTY";
        } else {
            return result.toString();
        }
    }
}