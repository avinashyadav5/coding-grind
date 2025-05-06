class Solution {
    public int countPartitions(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length-1;i++)
        {
            int a=0;int b=0;
            for(int j=0;j<nums.length;j++)
            {
                if(j<=i)
                a+=nums[j];
                else
                b+=nums[j];
            }
            if((b-a)%2==0)
            count++;
        }
        return count;
    }
}