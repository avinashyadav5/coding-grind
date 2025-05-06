class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] merged = new int[m + n];
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }
        while (i < m) {
            merged[k++] = nums1[i++];
        }
        while (j < n) {
            merged[k++] = nums2[j++];
        }
        if((m+n)%2!=0)
        {
            double a=merged[(m+n)/2];
            return a;
        }
        else
        {
            double a=merged[(m+n)/2];
            double b=merged[((m+n)/2)-1];
            double c=(a+b)/2;
            return c;
        }
    }
}