class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int[] count = new int[100]; 
        int res = 0; 
        for (int i = 0; i < dominoes.length; i++) {
            int a = dominoes[i][0];
            int b = dominoes[i][1];
            int val;
            if (a < b) {
                val = a * 10 + b;
            } else {
                val = b * 10 + a;
            }
            res += count[val];
            count[val]++;
        }
        return res;
    }
}