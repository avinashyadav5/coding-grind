class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int l = 0, r = height.length - 1;
        while (l < r) {
            int curWidth = r - l;
            int curHeight = Math.min(height[l], height[r]);
            maxArea = Math.max(maxArea, curWidth * curHeight);

            if (height[l] <= height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return maxArea;
    }
}