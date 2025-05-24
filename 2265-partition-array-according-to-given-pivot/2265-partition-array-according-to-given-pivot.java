class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        int arr[]=new int[n];
        int c=0;int d=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]<pivot)
            {
            arr[c]=nums[i];
            c++;
            }
            if(nums[i]==pivot)
            d++;
        }
        if(d>0)
        for(int i=0;i<n;i++)
        {
            if(nums[i]==pivot){
            arr[c]=nums[i];
            c++;
            }
        }
        for(int i=0;i<n;i++)
        {
            if(nums[i]>pivot){
            arr[c]=nums[i];
            c++;}
        }
        return arr;
    }
}