class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int left = 0, right = 0;
        int odd = 0, result = 0, validPrefixCount = 0;

        while (right < nums.length) {
            if (nums[right] % 2 == 1) {
                odd++;
                validPrefixCount = 0;
            }

            while (odd == k) {
                validPrefixCount++;
                if (nums[left] % 2 == 1) {
                    odd--;
                }
                left++;
            }
            result += validPrefixCount;
            right++;
        }
        return result;
    }
}
