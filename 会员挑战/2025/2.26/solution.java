import java.util.HashMap;
import java.util.Map;

public class solution {
    class Solution {
        public boolean canPermutePalindrome(String s) {
            Map<Character, Integer> mp = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                mp.put(c, mp.getOrDefault(c, 0) + 1);
            }
            int cnt = 0;
            for (Map.Entry<Character, Integer> entry : mp.entrySet()) {
                if (entry.getValue() % 2 == 1) cnt++;
            }
            return cnt <= 1;
        }
    }
}
