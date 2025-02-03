import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine().trim();
        
        if (input.isEmpty()) {
            System.out.println(0);
            return;
        }
        
        String[] words = input.trim().split(" ");
        System.out.println(words.length);
    }
}
