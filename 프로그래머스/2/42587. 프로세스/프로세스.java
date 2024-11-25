import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<int[]> queue = new LinkedList<>();

        for (int index = 0; index < priorities.length; index++) {
            queue.add(new int[]{priorities[index], index});
        }

        int count = 0;
        while (!queue.isEmpty()) {
            int[] current = queue.poll();

            boolean hasHigherPriority = false;
            for (int[] process : queue) {
                if (process[0] > current[0]) {
                    hasHigherPriority = true;
                    break;
                }
            }

            if (hasHigherPriority) {
                queue.add(current);
                continue;
            }

            count++;

            if (current[1] == location) {
                break;
            }
        }
        return count;
    }
}

