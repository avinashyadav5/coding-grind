class Solution {
    public int findClosest(int x, int y, int z) {
        int diff1=Math.abs(x-z);
        int diff2=Math.abs(y-z);
        if(diff1<diff2)
        return 1;
        else if(diff1>diff2)
        return 2;
        else 
        return 0;
    }
}