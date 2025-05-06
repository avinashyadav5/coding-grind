class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int min=Math.min(nums1.length,nums2.length);
        int a[] = new int[min];
        int c = 0;
        for (int i = 0; i < nums1.length; i++) {
            if(i>0)
            if(nums1[i-1]==nums1[i])
            continue;
            int z=0;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    if(z==0){
                    a[c] = nums1[i];
                    c++;z++;}
                }
            }
        }
        int z[]=new int[c];
        for(int i=0;i<c;i++)
        {
            z[i]=a[i];
        }
        return z;
    }
}