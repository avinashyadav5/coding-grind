class Solution {
    public boolean judgeCircle(String moves) {
        int u=0,d=0,l=0,r=0;
        for(int i=0;i<moves.length();i++)
        {
            char ch=moves.charAt(i);
            if(ch=='U')
            u++;
            if(ch=='D')
            d++;
            if(ch=='L')
            l++;
            if(ch=='R')
            r++;
        }
        if(u==d && l==r)
        return true;
        else
        return false;
    }
}