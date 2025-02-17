
import java.io.*;
import java.util.*;

public class Main {

    static class Node {
        private final int number;
        private final List<Node> neighbors;

        public Node(int number) {
            this.number = number;
            this.neighbors = new ArrayList<>();
        }

        public void addNeighbor(Node neighbor) {
            neighbors.add(neighbor);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int vertexCount = Integer.parseInt(tokenizer.nextToken());
        int edgeCount = Integer.parseInt(tokenizer.nextToken());

        Map<Integer, Node> nodes = new HashMap<>();
        for (int i = 1; i <= vertexCount; i++) {
            nodes.put(i, new Node(i));
        }

        for (int i = 0; i < edgeCount; i++) {
            tokenizer = new StringTokenizer(reader.readLine());
            int start = Integer.parseInt(tokenizer.nextToken());
            int end = Integer.parseInt(tokenizer.nextToken());

            Node firstNode = nodes.get(start);
            Node secondNode = nodes.get(end);

            firstNode.addNeighbor(secondNode);
            secondNode.addNeighbor(firstNode);
        }

        int count = 0;
        boolean[] visited = new boolean[vertexCount + 1];
        for (int i = 1; i <= vertexCount; i++) {
            if (!visited[i]) {
                dfs(nodes.get(i), visited);
                count += 1;
            }
        }

        System.out.println(count);
    }

    static void dfs(Node node, boolean[] visited) {
        visited[node.number] = true;

        for (Node neighbor : node.neighbors) {
            if (!visited[neighbor.number]) {
                dfs(neighbor, visited);
            }
        }
    }
}
