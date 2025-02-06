import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < N; i++) {
            String[] split = reader.readLine().split(" ");
            String first = split[0];
            String second = split[1];

            int targetIndex = first.toLowerCase().indexOf("x");
            result.append(second.toUpperCase().charAt(targetIndex));
        }
        
        System.out.println(result);
    }
}
