import java.util.*;

public class Main {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Deque<Integer> CARDS = new ArrayDeque<>();

    public static void main(String[] args) {
        int maxCardNumber = SCANNER.nextInt();
        for (int i = 1; i <= maxCardNumber; i++) {
            CARDS.offerLast(i);
        }

        List<Integer> discardPile = new ArrayList<>();
        while (CARDS.size() > 1) {
            discardPile.add(CARDS.pollFirst());
            CARDS.offerLast(CARDS.pollFirst());
        }

        StringBuilder result = new StringBuilder();
        for (Integer discard : discardPile) {
            result.append(discard).append(" ");
        }
        result.append(CARDS.peekFirst());
        System.out.println(result);
    }
}
