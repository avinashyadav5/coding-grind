class Solution {
    public int[][] generateMatrix(int n) {
        int mat[][]=new int[n][n];
        int t=0,b=n-1,r=n-1,l=0,c=1;
        while(t<=b&&l<=r)
        {
            for(int i=l;i<=r;i++)
            {
                mat[t][i]=c;
                c++;
            }
            t++;
            for(int i=t;i<=b;i++)
            {
                mat[i][r]=c;
                c++;
            }
            r--;
            if(t<=b){
            for(int i=r;i>=l;i--)
            {
                mat[b][i]=c;
                c++;
            }
            b--;}
            if(l<=r){
            for(int i=b;i>=t;i--)
            {
                mat[i][l]=c;
                c++;
            }
            l++; }
        }
        return mat;
    }
}