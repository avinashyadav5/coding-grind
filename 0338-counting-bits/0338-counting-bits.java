class Solution {
    public int[] countBits(int n) {
        int arr[]=new int[n+1];
        arr[0]=0;
        for(int i=0;i<n;i++)
        {
            int c=0;
            int s=i+1;
            while(s>0)
            {
                int d=s%2;
                if(d==1)
                c++;
                s/=2;
            }
            arr[i+1]=c;
        }
        return arr;
    }
}