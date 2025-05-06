class Solution {
    public boolean isHappy(int n) {
        while(n>9)
        { 
            int sum=0;
            while(n>0)
            {
                int d=n%10;
                sum+=d*d;
                n/=10;
            }
            n=sum;
        }
        if(n==1 || n==7)
        return true;
        else 
        return false;
    }
}