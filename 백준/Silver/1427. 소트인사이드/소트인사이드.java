import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] split = input.split("");
        List<Integer> numbers = new ArrayList<>();
        for (String num : split) {
            numbers.add(Integer.parseInt(num));
        }
        
        numbers.sort(Collections.reverseOrder());
        
        StringBuilder builder = new StringBuilder();
        for (Integer number : numbers) {
            builder.append(number);
        }
        
        System.out.println(builder);
    }
}
