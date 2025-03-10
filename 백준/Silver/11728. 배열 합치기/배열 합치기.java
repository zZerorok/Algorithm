import java.io.*;
import java.util.*;

public class Main {

    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter WRITER = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final List<Integer> VALUES = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        String[] arraySizes = READER.readLine().split(" ");
        String firstInput = READER.readLine();
        String secondInput = READER.readLine();

        addElements(firstInput, Integer.parseInt(arraySizes[0]));
        addElements(secondInput, Integer.parseInt(arraySizes[1]));
        sort();
        writeValues();

        WRITER.flush();
        WRITER.close();
        READER.close();
    }

    private static void addElements(String input, int size) {
        String[] array = input.split(" ");
        for (int i = 0; i < size; i++) {
            VALUES.add(Integer.parseInt(array[i]));
        }
    }

    private static void sort() {
        Collections.sort(VALUES);
    }

    private static void writeValues() throws IOException {
        for (Integer value : VALUES) {
            WRITER.write(value + " ");
        }
    }
}
