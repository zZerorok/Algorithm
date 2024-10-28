import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < progresses.length; i++) {
            int daysRemaining = (100 - progresses[i] + speeds[i] - 1) / speeds[i];
            queue.offer(daysRemaining);
        }
        
        List<Integer> result = new ArrayList<>();
        while (!queue.isEmpty()) {
            int remainDay = queue.poll();
            int count = 1;

            while (!queue.isEmpty() && queue.peek() <= remainDay) {
                queue.poll();
                count++;
            }

            result.add(count);
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}