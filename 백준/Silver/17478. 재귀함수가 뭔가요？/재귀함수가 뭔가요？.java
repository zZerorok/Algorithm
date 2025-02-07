import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
        int prefixCount = 0;
        String prefix = "____";
        recursive(count, prefix, prefixCount);
    }

    public static void recursive(int count, String prefix, int prefixCount) {
        if (count == 0) {
            System.out.println(prefix.repeat(prefixCount) + "\"재귀함수가 뭔가요?\"");
            System.out.println(prefix.repeat(prefixCount) + "\"재귀함수는 자기 자신을 호출하는 함수라네\"");
            System.out.println(prefix.repeat(prefixCount) + "라고 답변하였지.");
            return;
        }

        System.out.println(prefix.repeat(prefixCount) + "\"재귀함수가 뭔가요?\"");
        System.out.println(prefix.repeat(prefixCount) + "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.");
        System.out.println(prefix.repeat(prefixCount) + "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.");
        System.out.println(prefix.repeat(prefixCount) + "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"");

        recursive(count - 1, prefix, prefixCount + 1);

        System.out.println(prefix.repeat(prefixCount) + "라고 답변하였지.");
    }
}
