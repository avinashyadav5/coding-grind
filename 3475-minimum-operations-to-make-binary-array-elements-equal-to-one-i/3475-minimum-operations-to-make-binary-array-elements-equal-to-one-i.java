class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int c = 0;
        for (int i = 0; i < n - 2; i++) {
            if (nums[i] == 0) {
                nums[i] = nums[i] == 0 ? 1 : 0;
                nums[i + 1] = nums[i + 1] == 0 ? 1 : 0;
                nums[i + 2] = nums[i + 2] == 0 ? 1 : 0;
                c++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] != 1)
                return -1;
        }
        return c;
    }
}