import java.util.Set;
import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int pokemonNum : nums) {
            set.add(pokemonNum);
        }
    
        int pokemonCount = set.size();
        
        int maxPokemonCount = nums.length / 2;
        
        return Math.min(maxPokemonCount, pokemonCount);
    }
}