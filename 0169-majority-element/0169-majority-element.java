class Solution {
    public int majorityElement(int[] nums) {
        int count1 = nums[0];
        int count = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == count1)
            count++;
            else
            {
                count--;
                if (count == 0) {
                    count1 = nums[i];
                    count = 1;
                }
            }
        }
        return count1;
    }
}