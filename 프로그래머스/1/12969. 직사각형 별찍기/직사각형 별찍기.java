import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < m; i++) {
            result.append("*".repeat(n)).append("\n");
        }

        System.out.println(result);
    }
}