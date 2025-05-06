class Solution {
    public int maximumPrimeDifference(int[] nums) {
        int a=0;int b=0;int s=0;int diff=0;
        for(int i=0;i<nums.length;i++)
        {
            int count=0;
            for(int j=2;j<nums[i];j++)
            {
                if(nums[i]%j==0)
                { 
                   count++;
                }
            }
            if(nums[i]==1)
                count=2;
            if(count==0)
            {
                if(s==0){
                a=i;s++;}
            }
            if(count==0)
            {
                b=i;
                diff=b-a;
            }
        }
        return diff;
    }
}