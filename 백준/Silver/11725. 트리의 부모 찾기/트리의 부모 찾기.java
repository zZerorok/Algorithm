import java.io.*;
import java.util.*;

public class Main {

    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter WRITER = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final Map<Integer, Node> NODES = new HashMap<>();
    private static final List<Vertex> VERTICES = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        int nodeCount = Integer.parseInt(READER.readLine());
        readConnections(nodeCount - 1);
        processNode(nodeCount);
        writeParentNode();
    }

    private static void readConnections(int vertexCount) throws IOException {
        for (int i = 0; i < vertexCount; i++) {
            String[] split = READER.readLine().split(" ");
            VERTICES.add(new Vertex(Integer.parseInt(split[0]), Integer.parseInt(split[1])));
        }
    }

    private static void processNode(int nodeCount) {
        initNode(nodeCount);
        linkNode();
        Node rootNode = NODES.get(1);
        setParentNode(rootNode, null);
    }

    private static void initNode(int count) {
        for (int i = 1; i <= count; i++) {
            NODES.put(i, new Node(i));
        }
    }

    private static void linkNode() {
        for (Vertex vertex : VERTICES) {
            Node node1 = NODES.get(vertex.start);
            Node node2 = NODES.get(vertex.end);
            node1.link(node2);
            node2.link(node1);
        }
    }

    private static void setParentNode(Node currentNode, Node parentNode) {
        currentNode.setParent(parentNode);

        for (Node nextNode : currentNode.nextNodes) {
            if (nextNode.parent == null) {
                setParentNode(nextNode, currentNode);
            }
        }
    }

    private static void writeParentNode() throws IOException {
        for (int i = 2; i <= NODES.size(); i++) {
            WRITER.write(NODES.get(i).parentNumber() + System.lineSeparator());
        }
        WRITER.flush();
        WRITER.close();
    }

    static class Vertex {
        private final int start;
        private final int end;

        public Vertex(int first, int second) {
            this.start = first;
            this.end = second;
        }
    }

    static class Node {
        private Node parent;
        private final int number;
        private final List<Node> nextNodes;

        private Node(int number) {
            this.parent = null;
            this.number = number;
            this.nextNodes = new ArrayList<>();
        }

        public int parentNumber() {
            return parent != null ? parent.number : 0;
        }

        public void link(Node targetNode) {
            nextNodes.add(targetNode);
        }

        public void setParent(Node parentNode) {
            this.parent = parentNode;
        }
    }
}
