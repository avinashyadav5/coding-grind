class Solution {
    public int[] minCosts(int[] cost) {
        int min = cost[0];
        for(int i = 1; i < cost.length; ++i) {
            if(min >= cost[i])
                min = cost[i];
            else
                cost[i] = min;
        }
        return cost;
    }
}