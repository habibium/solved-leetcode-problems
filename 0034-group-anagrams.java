import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();

        for (String s : strs) {
            char[] temp = s.toLowerCase().toCharArray();
            Arrays.sort(temp);
            String sorted = new String(temp);
            if (!groups.containsKey(sorted))
                groups.put(sorted, new ArrayList<>());
            groups.get(sorted).add(s);
        }

        return new ArrayList<>(groups.values());
    }
}