import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<String, String> map = new HashMap<>();
        String[] patterns = pattern.split("");
        String[] words = s.split(" ");

        if(patterns.length != words.length) {
            return false;
        }

        for (int i = 0; i < patterns.length; i++) {
            if (!map.containsKey(patterns[i]) && !map.containsValue(words[i])) {
                map.put(patterns[i], words[i]);
            }
        }
        
        for (int i = 0; i < patterns.length; i++) {
            if (!map.containsKey(patterns[i]) || !map.get(patterns[i]).equals(words[i])) {
                return false;
            }
        }

        return true;   
    }
}