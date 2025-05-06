class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int a=nums[0]-nums[nums.length-1];
        int max=Math.abs(a);
        for(int i=0;i<nums.length-1;i++)
        {
            int b=nums[i]-nums[i+1];
            b=Math.abs(b);
            if(max<b)
            max=b;
        }
        return max;
    }
}