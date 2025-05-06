class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int min=Math.min(nums1.length,nums2.length);
        int[] result = new int[min];
        int i = 0, j = 0, c = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                result[c++] = nums1[i];
                i++;
                j++;
            }
        }
        int z[]=new int[c];
        for(int k=0;k<c;k++)
        {
            z[k]=result[k];
        }
        return z;
    }
}