import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gamePlayer = scanner.nextInt();
        int targetId = scanner.nextInt();

        List<Player> playerList = new ArrayList<>();
        for (int i = 0; i < gamePlayer; i++) {
            playerList.add(new Player(i, scanner.nextInt()));
        }

        Queue<Player> players = new ArrayDeque<>();
        Set<Integer> visited = new HashSet<>();
        players.add(playerList.get(0));
        visited.add(0);

        int count = 0;
        while (!players.isEmpty()) {
            Player currentPlayer = players.poll();
            Player nextPlayer = playerList.get(currentPlayer.targetNumber);

            count += 1;

            if (targetId == nextPlayer.number) {
                System.out.println(count);
                return;
            }

            if (!visited.contains(nextPlayer.number)) {
                visited.add(nextPlayer.number);
                players.add(nextPlayer);
            }
        }

        System.out.println(-1);
    }

    static class Player {
        private final int number;
        private final int targetNumber;

        public Player(int number, int targetNumber) {
            this.number = number;
            this.targetNumber = targetNumber;
        }
    }
}
