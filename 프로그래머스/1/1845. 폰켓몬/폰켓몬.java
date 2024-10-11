import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int pokemonNum : nums) {
            map.put(pokemonNum, map.getOrDefault(pokemonNum, 0) + 1);
        }
        int pokemonCount = map.size();
        
        int maxPokemonCount = nums.length / 2;
        
        return Math.min(maxPokemonCount, pokemonCount);
    }
}