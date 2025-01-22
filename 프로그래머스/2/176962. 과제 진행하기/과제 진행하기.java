import java.util.*;
import java.util.stream.Collectors;

class Solution {
    
     public String[] solution(String[][] plans) {
        List<Task> taskList = convertTasks(plans);
        Deque<Task> tasks = new ArrayDeque<>(taskList);
        Deque<Task> pausedTasks = new ArrayDeque<>();
        List<String> endedTasks = new ArrayList<>();

        Task currentTask = tasks.pollFirst();
        int time = currentTask.start();

        while (!tasks.isEmpty()) {
            Task nextTask = tasks.peekFirst();
            time += currentTask.playtime();

            if (time > nextTask.start()) {
                Task updatedTask = currentTask.updatePlaytime(time - nextTask.start());
                pausedTasks.push(updatedTask);
            } else {
                endedTasks.add(currentTask.name());

                if (!pausedTasks.isEmpty()) {
                    currentTask = pausedTasks.pop();
                    continue;
                }
            }

            currentTask = tasks.pollFirst();
            time = currentTask.start();
        }

        endedTasks.add(currentTask.name());

        while (!pausedTasks.isEmpty()) {
            endedTasks.add(pausedTasks.pop().name());
        }

        return endedTasks.toArray(new String[0]);
    }

    private List<Task> convertTasks(String[][] plans) {
        return Arrays.stream(plans)
                .map(plan -> new Task(plan[0], convertToMinute(plan[1]), Integer.parseInt(plan[2])))
                .sorted(Comparator.comparingInt(Task::start))
                .collect(Collectors.toList());
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
