import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String word = reader.readLine();
        int index = Integer.parseInt(reader.readLine());
        System.out.println(word.charAt(index - 1));
    }
}
