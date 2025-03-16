import java.io.*;

public class Main {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int totalPrice = parseInt(reader.readLine());
            int itemCount = parseInt(reader.readLine());
            for (int i = 0; i < itemCount; i++) {
                String[] inputs = reader.readLine().split(" ");
                int price = parseInt(inputs[0]);
                int quantity = parseInt(inputs[1]);
                totalPrice -= price * quantity;
            }

            if (totalPrice == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static int parseInt(String value) {
        return Integer.parseInt(value);
    }
}
