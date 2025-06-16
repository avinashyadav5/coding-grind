class Solution {
    public int maximumDifference(int[] nums) {
        int min = nums[0];
        int m = -1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > min) {
                m = Math.max(m, nums[i] - min);
            } 
            else {
                min = nums[i];
            }
        }
        return m;
    }
}
