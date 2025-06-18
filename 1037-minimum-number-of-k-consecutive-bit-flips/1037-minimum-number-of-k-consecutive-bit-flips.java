class Solution {
    public int minKBitFlips(int[] nums, int k) {
        int n = nums.length;
        int[] flipMark = new int[n];
        int flip = 0, count = 0;

        for (int i = 0; i < n; i++) {
            if (i >= k) {
                flip ^= flipMark[i - k];
            }

            if ((nums[i] ^ flip) == 0) {
                if (i + k > n)
                    return -1;
                flipMark[i] = 1;
                flip ^= 1;
                count++;
            }
        }
        return count;
    }
}
