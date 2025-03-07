import java.io.*;
import java.util.*;

public class Main {

    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int count = Integer.parseInt(READER.readLine());
        String[] values = READER.readLine().split(" ");

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            numbers.add(Integer.parseInt(values[i]));
        }
        
        System.out.println(Collections.min(numbers) + " " + Collections.max(numbers));
    }
}
