import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(reader.readLine());
        for (int t = 0; t < testCase; t++) {
            String[] inputs = reader.readLine().split(" ");
            int height = Integer.parseInt(inputs[0]);
            int guest = Integer.parseInt(inputs[2]);

            int floor = guest % height == 0 ? height : guest % height;
            int room = (guest - 1) / height + 1;

            writer.write(String.format("%d%02d\n", floor, room));
        }
        writer.flush();
    }
}
