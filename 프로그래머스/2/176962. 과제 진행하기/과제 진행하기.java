import java.util.*;
import java.util.stream.Collectors;

class Solution {
    
     public String[] solution(String[][] plans) {
        List<Task> taskList = Arrays.stream(plans).map(plan -> 
                        new Task(plan[0], convertToMinute(plan[1]), Integer.parseInt(plan[2]))
                )
                .sorted(Comparator.comparingInt(Task::start))
                .collect(Collectors.toUnmodifiableList());

        Deque<Task> tasks = new ArrayDeque<>(taskList);
        Stack<Task> pausedTasks = new Stack<>();
        List<String> endedTasks = new ArrayList<>();

        Task currentTask = tasks.poll();
        int currentTime = currentTask.start();

        while (!tasks.isEmpty()) {
            currentTime += currentTask.playtime();
            Task nextTask = tasks.peek();

            if (currentTime > nextTask.start()) {
                Task updatedTask = currentTask.updatePlaytime(currentTime - nextTask.start());
                pausedTasks.push(updatedTask);
            } else {
                endedTasks.add(currentTask.name());
                if (!pausedTasks.empty()) {
                    currentTask = pausedTasks.pop();
                    continue;
                }
            }
            currentTask = tasks.poll();
            currentTime = currentTask.start();
        }

        endedTasks.add(currentTask.name());
        while (!pausedTasks.empty()) {
            endedTasks.add(pausedTasks.pop().name());
        }

        return endedTasks.toArray(new String[0]);
    }

    private int convertToMinute(String time) {
        String[] split = time.split(":");
        return Integer.parseInt(split[0]) * 60 + Integer.parseInt(split[1]);
    }
}

class Task {
    private final String name;
    private final int start;
    private final int playtime;

    Task(String name, int start, int playtime) {
        this.name = name;
        this.start = start;
        this.playtime = playtime;
    }

    public String name() {
        return name;
    }

    public int start() {
        return start;
    }

    public int playtime() {
        return playtime;
    }

    public Task updatePlaytime(int updateTime) {
        return new Task(this.name, this.start, updateTime);
    }
}
