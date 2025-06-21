class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        for (int e : nums) {
            if (e < 0) {
                b.add(e);
            } else {
                a.add(e);
            }
        }
        for (int i = 0; i < n; i += 2) {
            nums[i] = a.get(i / 2);
            nums[i + 1] = b.get(i / 2);
        }
        return nums;
    }
}