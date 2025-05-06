import java.util.HashMap;

class Solution {
    public int maximumSum(int[] nums) {
        HashMap<Integer, Integer> m = new HashMap<>();
        int result = -1;

        for (int i = 0; i < nums.length; i++) {
            int d = digitSum(nums[i]);
            if (m.containsKey(d)) {
                result = Math.max(result, m.get(d) + nums[i]);
                m.put(d, Math.max(m.get(d), nums[i]));
            } else {
                m.put(d, nums[i]);
            }
        }

        return result;
    }

    int digitSum(int a) {
        int sum = 0;
        while (a > 0) {
            sum += a % 10;
            a /= 10;
        }
        return sum;
    }
}
