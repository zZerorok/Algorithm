import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(reader.readLine());

        for (int i = 0; i < testcase; i++) {
            String[] documentAndTarget = reader.readLine().split(" ");
            int documentCount = Integer.parseInt(documentAndTarget[0]);
            int targetIndex = Integer.parseInt(documentAndTarget[1]);

            Deque<Document> documents = new ArrayDeque<>();
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

            String[] documentList = reader.readLine().split(" ");
            for (int j = 0; j < documentCount; j++) {
                int priority = Integer.parseInt(documentList[j]);

                documents.offerLast(new Document(j, priority));
                priorityQueue.add(priority);
            }

            int printCount = 0;
            while (!documents.isEmpty()) {
                Document currentDocument = documents.pollFirst();
                Integer currentPriority = priorityQueue.peek();

                if (!priorityQueue.isEmpty() && currentDocument.priority == currentPriority) {
                    printCount += 1;
                    priorityQueue.poll();

                    if (currentDocument.index == targetIndex) {
                        System.out.println(printCount);
                        break;
                    }
                } else {
                    documents.offerLast(currentDocument);
                }
            }
        }
    }

    static class Document {
        private final int index;
        private final int priority;

        public Document(int index, int priority) {
            this.index = index;
            this.priority = priority;
        }
    }
}
