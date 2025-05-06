class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int max=0;
        for(int i=0;i<prices.length;i++)
        {
            int price = prices[i];
            min = Math.min(min, price);
            int profit = price - min;
            max = Math.max(max, profit);
        }
        return max;
    }
}