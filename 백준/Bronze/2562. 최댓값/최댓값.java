import java.io.*;

public class Main {

    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int maxNumber = 0;
        int index = 0;
        for (int i = 1; i < 10; i++) {
            int number = Integer.parseInt(READER.readLine());
            if (maxNumber < number) {
                maxNumber = number;
                index = i;
            }
        }
        
        System.out.println(maxNumber + System.lineSeparator() + index);
    }
}
