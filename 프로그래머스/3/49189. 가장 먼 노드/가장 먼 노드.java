import java.util.*;

class Solution {
    public int solution(int n, int[][] edge) {
        Map<Integer, Node> nodes = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            nodes.put(i, new Node(i));
        }

        for (int[] num : edge) {
            Node node1 = nodes.get(num[0]);
            Node node2 = nodes.get(num[1]);

            node1.link(node2);
            node2.link(node1);
        }

        Queue<Node> queue = new ArrayDeque<>();
        Map<Node, Integer> distances = new HashMap<>();

        Node rootNode = nodes.get(1);
        distances.put(rootNode, 0);
        queue.add(rootNode);

        int maxDistance = 0;
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            Integer currentDistance = distances.get(current);

            for (Node neighbor : current.neighbors) {
                if (!distances.containsKey(neighbor)) {
                    distances.put(neighbor, currentDistance + 1);
                    maxDistance = Math.max(maxDistance, currentDistance + 1);
                    queue.add(neighbor);
                }
            }
        }

        int count = 0;
        for (Integer distance : distances.values()) {
            if (distance == maxDistance) {
                count++;
            }
        }
        return count;
    }

    static class Node {
        private final int number;
        private final List<Node> neighbors;

        private Node(int number) {
            this.number = number;
            this.neighbors = new ArrayList<>();
        }

        public void link(Node node) {
            neighbors.add(node);
        }
    }
}
