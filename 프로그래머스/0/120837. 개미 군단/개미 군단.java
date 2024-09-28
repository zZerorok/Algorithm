class Solution {
    public int solution(int hp) {
        int generalAntPower = 5;
        int soldierAntPower = 3;
        int workerAntPower = 1;

        int generalAntCount = 0;
        int soldierAntCount = 0;
        int workerAntCount = 0;

        generalAntCount = hp / generalAntPower;
        hp %= generalAntPower;

        soldierAntCount = hp / soldierAntPower;
        hp %= soldierAntPower;

        workerAntCount = hp / workerAntPower;
        hp %= workerAntPower;

        return generalAntCount + soldierAntCount + workerAntCount;
    }
}