import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        reader.readLine();

        String[] elements1 = reader.readLine().split(" ");
        String[] elements2 = reader.readLine().split(" ");

        Set<Integer> setA = new HashSet<>();
        for (String element : elements1) {
            setA.add(Integer.parseInt(element));
        }

        Set<Integer> setB = new HashSet<>();
        for (String element : elements2) {
            setB.add(Integer.parseInt(element));
        }

        Set<Integer> copyA = new HashSet<>(setA);
        copyA.removeAll(setB);
        Set<Integer> copyB = new HashSet<>(setB);
        copyB.removeAll(setA);

        int result = copyA.size() + copyB.size();

        writer.write(String.valueOf(result));
        writer.flush();
    }
}
