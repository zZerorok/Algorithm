import java.util.*;
import java.util.stream.Collectors;

class Solution {
    
     public String[] solution(String[][] plans) {
        LinkedList<Task> tasks = new LinkedList<>();

        // 과제 정보를 담기
        for (String[] plan : plans) {
            tasks.offer(new Task(plan[0], convertToMinute(plan[1]), Integer.parseInt(plan[2])));
        }

        // 과제 시작 시간 순으로 정렬
        tasks.sort(Comparator.comparingInt(Task::start));

        // 멈춘 과제를 저장할 스택과 끝난 과제를 저장할 리스트
        Stack<Task> pausedTasks = new Stack<>();
        List<String> endedTasks = new ArrayList<>();

        // 첫 번째 과제
        Task currentTask = tasks.poll();
        int currentTime = currentTask.start();

        while (!tasks.isEmpty()) {
            // 현재 과제를 끝내고 나서 남은 시간
            currentTime += currentTask.playtime();
            Task nextTask = tasks.peek(); // 다음 과제

            if (currentTime > nextTask.start()) { // 현재 과제를 끝내지 못하고, 다음 과제가 시작됨
                // 남은 시간을 계산하여 멈춤
                currentTask = currentTask.updatePlaytime(currentTime - nextTask.start());
                pausedTasks.push(currentTask); // 멈춘 과제 스택에 저장
            } else { // 현재 과제를 끝낼 수 있음
                endedTasks.add(currentTask.name()); // 끝낸 과제 이름 추가
                if (!pausedTasks.empty()) { // 멈춘 과제가 있다면
                    currentTask = pausedTasks.pop(); // 가장 최근에 멈춘 과제부터 다시 시작
                    continue;
                }
            }
            currentTask = tasks.poll(); // 다음 과제를 꺼냄
            currentTime = currentTask.start(); // 새로운 시작 시간
        }

        endedTasks.add(currentTask.name()); // 마지막 과제도 끝내기
        while (!pausedTasks.empty()) { // 멈춘 과제가 남아 있다면 끝낸 후 리스트에 추가
            endedTasks.add(pausedTasks.pop().name());
        }

        return endedTasks.toArray(new String[0]); // 끝낸 과제 순서대로 반환
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

