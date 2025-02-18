import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer, Node> nodes = new HashMap<>();
        int nodeCount = Integer.parseInt(reader.readLine());
        for (int i = 1; i <= nodeCount; i++) {
            nodes.put(i, new Node(i));
        }

        for (int i = 0; i < nodeCount - 1; i++) {
            String[] split = reader.readLine().split(" ");
            int num1 = Integer.parseInt(split[0]);
            int num2 = Integer.parseInt(split[1]);

            Node node1 = nodes.get(num1);
            Node node2 = nodes.get(num2);
            node1.addChild(node2);
            node2.addChild(node1);
        }

        dfs(nodes.get(1), null);

        for (int i = 2; i <= nodeCount; i++) {
            System.out.println(nodes.get(i).parent.number);
        }
    }

    private static void dfs(Node node, Node parent) {
        node.setParent(parent);

        for (Node child : node.children) {
            if (child.parent == null) {
                dfs(child, node);
            }
        }
    }

    static class Node {
        private final int number;
        private Node parent;
        private final List<Node> children;

        public Node(int number) {
            this.number = number;
            this.parent = null;
            this.children = new ArrayList<>();
        }

        public void addChild(Node child) {
            this.children.add(child);
        }

        public void setParent(Node parent) {
            this.parent = parent;
        }
    }
}
