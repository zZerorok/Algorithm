import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder builder = new StringBuilder();
        
        String input = reader.readLine();

        for (char current : input.toCharArray()) {
            if (Character.isUpperCase(current)) {
                builder.append(Character.toLowerCase(current));
            } else {
                builder.append(Character.toUpperCase(current));
            }
        }
        
        writer.write(builder.toString());
        writer.flush();
    }
}
