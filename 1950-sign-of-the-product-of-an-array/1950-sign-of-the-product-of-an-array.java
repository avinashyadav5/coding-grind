class Solution {
    public int arraySign(int[] nums) {
        int pro = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) return 0;
            if (nums[i] < 0) pro *= -1;
        }
        return signFunc(pro);
    }
    int signFunc(int x)
    {
        if(x>=1)
        return 1;
        else if(x==0)
        return 0;
        else
        return -1;
    }
}