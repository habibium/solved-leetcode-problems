import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int n : nums)
            countMap.put(n, countMap.getOrDefault(n, 0) + 1);

        List<int[]> countList = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            countList.add(new int[] { entry.getKey(), entry.getValue() });
        }
        countList.sort((a, b) -> b[1] - a[1]);

        int[] result = new int[k];
        for (int i = 0; i < k; i++)
            result[i] = countList.get(i)[0];

        return result;
    }
}
