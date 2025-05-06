class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);
        List<Integer> a = new ArrayList<>();
        int c=0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                a.add(nums[i]);
                c++;
            }
        }
        return a;
    }
}