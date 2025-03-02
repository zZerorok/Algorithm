import java.util.*;

public class Main {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Deque<Integer> CARDS = new ArrayDeque<>();
    private static final List<Integer> DISCARD_PILE = new ArrayList<>();
    private static final StringBuilder RESULT = new StringBuilder();

    public static void main(String[] args) {
        int maxCardNumber = SCANNER.nextInt();
        for (int i = 1; i <= maxCardNumber; i++) {
            CARDS.offerLast(i);
        }

        while (CARDS.size() > 1) {
            DISCARD_PILE.add(CARDS.pollFirst());
            CARDS.offerLast(CARDS.pollFirst());
        }

        for (Integer discard : DISCARD_PILE) {
            RESULT.append(discard).append(" ");
        }
        RESULT.append(CARDS.peekFirst());

        System.out.println(RESULT);
    }
}
