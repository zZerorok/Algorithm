import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int computerCount = Integer.parseInt(reader.readLine());
        int linkedCount = Integer.parseInt(reader.readLine());

        Map<Integer, Network> networks = new HashMap<>();
        for (int i = 1; i <= computerCount; i++) {
            networks.put(i, new Network(i));
        }

        for (int i = 0; i < linkedCount; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            int computer1 = Integer.parseInt(tokenizer.nextToken());
            int computer2 = Integer.parseInt(tokenizer.nextToken());

            Network network1 = networks.get(computer1);
            Network network2 = networks.get(computer2);

            network1.linkedNetworks.add(network2);
            network2.linkedNetworks.add(network1);
        }

        Network virusComputer = networks.get(1);
        int infectedCount = bfs(virusComputer);
        System.out.println(infectedCount);
    }

    private static int bfs(Network start) {
        Queue<Network> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        queue.add(start);
        visited.add(start.computerNumber);

        int infectedCount = 0;
        while (!queue.isEmpty()) {
            Network current = queue.poll();

            for (Network linked : current.linkedNetworks) {
                if (!visited.contains(linked.computerNumber)) {
                    queue.add(linked);
                    visited.add(linked.computerNumber);
                    infectedCount += 1;
                }
            }
        }
        return infectedCount;
    }

    static class Network {
        private final int computerNumber;
        private final List<Network> linkedNetworks;

        public Network(int computerNumber) {
            this.computerNumber = computerNumber;
            this.linkedNetworks = new ArrayList<>();
        }
    }
}
