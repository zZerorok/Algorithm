import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        String str = inputs[0];
        int count = Integer.parseInt(inputs[1]);
        String repeatStr = str.repeat(count);
        System.out.println(repeatStr);
    }
}
                           