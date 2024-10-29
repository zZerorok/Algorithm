import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        Set<Integer> deletes = new HashSet<>();
        for (int deleteNum : delete_list) {
            deletes.add(deleteNum);
        }

        List<Integer> numbers = new ArrayList<>();
        for (int number : arr) {
            if (!deletes.contains(number)) {
                numbers.add(number);
            }
        }
        
        return numbers.stream().mapToInt(Integer::intValue).toArray();
    }
}