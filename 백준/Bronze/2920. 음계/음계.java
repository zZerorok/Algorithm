import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] scales = reader.readLine().split(" ");
        int[] scaleNumbers = Arrays.stream(scales)
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] ascending = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] descending = {8, 7, 6, 5, 4, 3, 2, 1,};

        if (Arrays.equals(scaleNumbers, ascending)) {
            System.out.println("ascending");
        } else if (Arrays.equals(scaleNumbers, descending)) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}
