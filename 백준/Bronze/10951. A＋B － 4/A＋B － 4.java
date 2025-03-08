import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = "";

        while ((line = reader.readLine()) != null) {
            String[] numbers = line.split(" ");
            System.out.println(Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]));
        }
    }
}
