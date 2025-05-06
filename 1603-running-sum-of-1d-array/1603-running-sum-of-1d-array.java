class Solution {
    public int[] runningSum(int[] nums) {
        int[] a = new int[nums.length];
        if(nums.length == 0)
            return a;
        a[0] = nums[0];
        for(int idx = 1; idx < nums.length; idx++) {
            a[idx] = a[idx-1]+ nums[idx];
        }
        return a;
    }
}