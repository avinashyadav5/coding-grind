class Solution {
    public int hammingDistance(int x, int y) 
    {
        int num = 0;
        while (x > 0 || y > 0)
        {
            if (x % 2 != y % 2) 
              num++;
            x /= 2;
            y /= 2;
        }    
        return num;
    }
}