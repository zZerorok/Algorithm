import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int level : scoville) {
            queue.add(level);
        }
        
        int mixCount = 0;
        while (queue.peek() < K) {
            if (queue.size() < 2) {
                return -1;
            }
            
            int firstScoville = queue.poll();
            int secondScoville = queue.poll();
            int mixScoville = firstScoville + (secondScoville * 2);
            queue.add(mixScoville);

            mixCount++;
        }
        
        return mixCount;
    }
}