import java.io.*;

public class Main {

    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder BUILDER = new StringBuilder();

    public static void main(String[] args) throws IOException {
        while (true) {
            String line = READER.readLine();
            if (line.equals("0 0")) {
                break;
            }

            String[] input = line.split(" ");
            BUILDER.append(Integer.parseInt(input[0]) + Integer.parseInt(input[1]))
                    .append(System.lineSeparator());
        }

        System.out.println(BUILDER);
    }
}
