import java.util.*;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            freqMap.put(nums[i], freqMap.getOrDefault(nums[i], 0) + 1);
        }
        int[][] freqArray = new int[freqMap.size()][2];
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            freqArray[index][0] = entry.getKey();
            freqArray[index][1] = entry.getValue();
            index++;
        }

        Arrays.sort(freqArray, (a, b) -> b[1] - a[1]);

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = freqArray[i][0];
        }
        return result;
    }
}
