import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(reader.readLine());

        for (int i = 0; i < testCase; i++) {
            String[] sizeTokens = reader.readLine().split(" ");
            int aSize = Integer.parseInt(sizeTokens[0]);
            int bSize = Integer.parseInt(sizeTokens[1]);

            String[] aInputs = reader.readLine().split(" ");
            String[] bInputs = reader.readLine().split(" ");

            int[] groupA = parseAndSort(aInputs, aSize);
            int[] groupB = parseAndSort(bInputs, bSize);

            int result = countPairs(groupA, groupB);

            writer.write(String.valueOf(result));
            writer.newLine();
        }

        writer.flush();
        writer.close();
        reader.close();
    }

    private static int[] parseAndSort(String[] tokens, int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(tokens[i]);
        }
        Arrays.sort(arr);
        return arr;
    }

    private static int countPairs(int[] groupA, int[] groupB) {
        int count = 0;
        int pointerB = 0;
        int bSize = groupB.length;
        for (int value : groupA) {
            while (pointerB < bSize && groupB[pointerB] < value) {
                pointerB += 1;
            }
            count += pointerB;
        }
        return count;
    }
}
