class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        int sum = 0, F = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            F += i * nums[i];
        }
        int max = F; 
        
        for (int k = 1; k < n; k++) {
            F = F + sum - n * nums[n - k]; //F(k)=F(k−1)+sum(nums)−n×nums[n−k]
            max = Math.max(max, F);  
        }
        return max;
    }
}