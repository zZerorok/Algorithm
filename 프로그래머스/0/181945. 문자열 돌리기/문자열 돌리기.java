import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] split = a.split("");
        for (String current : split) {
            System.out.println(current);
        }
    }
}
