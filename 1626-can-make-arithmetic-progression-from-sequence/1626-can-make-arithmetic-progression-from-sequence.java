class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int a=arr[0];
        int d=arr[1]-arr[0];
        int s=a;
        boolean flag=true;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==s)
            {
                s+=d;
            }
            else
            flag=false;
        }
        return flag;
    }
}