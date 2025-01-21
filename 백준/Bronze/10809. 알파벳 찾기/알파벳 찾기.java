import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(word.indexOf(c) + " ");
        }
    }
}
