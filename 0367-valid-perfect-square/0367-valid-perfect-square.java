class Solution {
    public boolean isPerfectSquare(int num) {
        long r=(long)Math.sqrt(num);
        if(r*r==num)
        return true;
        else
        return false;
    }
}