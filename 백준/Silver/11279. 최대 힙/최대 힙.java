import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        int N = Integer.parseInt(reader.readLine());
        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(reader.readLine());

            if (x == 0) {
                if (maxHeap.isEmpty()) {
                    writer.write(String.valueOf(0));
                    writer.newLine();
                } else {
                    writer.write(String.valueOf(maxHeap.poll()));
                    writer.newLine();
                }
            } else {
                maxHeap.add(x);
            }
        }
        
        writer.flush();
    }
}
