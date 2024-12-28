import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] students = new int[n];
        Arrays.fill(students, 1);

        for (int student : lost) {
            students[student - 1]--;
        }

        for (int student : reserve) {
            students[student - 1]++;
        }

        for (int i = 0; i < n; i++) {
            if (students[i] == 0) {
                if (i > 0 && students[i - 1] == 2) {
                    students[i]++;
                    students[i - 1]--;
                } else if (i < n - 1 && students[i + 1] == 2) {
                    students[i]++;
                    students[i + 1]--;
                }
            }
        }

        return (int) Arrays.stream(students)
                .filter(student -> student > 0)
                .count();
    }
}