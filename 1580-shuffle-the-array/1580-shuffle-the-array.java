class Solution {
    public int[] shuffle(int[] nums, int n) {
        int a[]=new int[n*2];
        int c=0;
        for(int i=0;i<n;i++)
        {
            a[c]=nums[i]; c++;
            a[c]=nums[i+n]; c++;
        }
        return a;
    }
}