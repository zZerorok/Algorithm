import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.next();
        String second = scanner.next();

        int firstMin = Integer.parseInt(first.replace('6', '5'));
        int secondMin = Integer.parseInt(second.replace('6', '5'));
        int minSum = firstMin + secondMin;

        int firstMax = Integer.parseInt(first.replace('5', '6'));
        int secondMax = Integer.parseInt(second.replace('5', '6'));
        int maxSum = firstMax + secondMax;

        System.out.println(minSum + " " + maxSum);
    }
}
