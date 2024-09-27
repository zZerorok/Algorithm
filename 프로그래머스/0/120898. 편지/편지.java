import java.util.Arrays;

class Solution {
    public int solution(String message) {
       return (int) Arrays.stream(message.split("")).count() * 2;
    }
}