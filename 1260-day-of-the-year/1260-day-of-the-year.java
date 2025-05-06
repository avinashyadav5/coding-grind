class Solution {
    public int dayOfYear(String date) {
        String[] nums = date.split("-");
        int arr[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int y = Integer.parseInt(nums[0]);
        int m = Integer.parseInt(nums[1]);
        int d = Integer.parseInt(nums[2]);
        if((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)==true)
            arr[1] = 29;
        int res = 0;
        for (int i = 0; i < m - 1; i++) {
            res += arr[i];
        }
        res += d;
        return res;
    }
}