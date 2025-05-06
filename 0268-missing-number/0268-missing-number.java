class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int a = nums[n - 1];
        int d = 0;
        for (int i = 0; i < n; i++) {
            if (i != nums[i])
                return i;
        }
        return n;
    }
}