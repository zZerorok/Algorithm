import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String document = reader.readLine();
        String keyword = reader.readLine();

        int count = 0;
        int index = 0;
        while ((index = document.indexOf(keyword, index)) != -1) {
            count++;
            index += keyword.length();
        }
        System.out.println(count);
    }
}
