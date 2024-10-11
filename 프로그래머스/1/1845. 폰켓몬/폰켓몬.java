import java.util.Arrays;

class Solution {
    public int solution(int[] nums) {
        int pokemonCount = (int) Arrays.stream(nums)
                .distinct()
                .count();

        int maxPokemonCount = nums.length / 2;

        return Math.min(maxPokemonCount, pokemonCount);
    }
}