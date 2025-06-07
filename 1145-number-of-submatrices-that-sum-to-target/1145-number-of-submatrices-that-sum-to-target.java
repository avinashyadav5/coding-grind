class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length, ans = 0; 
        int presum[][] = new int [m][n]; 
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                presum[i][j] = matrix[i][j];
                if (i > 0) presum[i][j] += presum[i - 1][j];
                if (j > 0) presum[i][j] += presum[i][j - 1];
                if (i > 0 && j > 0) presum[i][j] -= presum[i - 1][j - 1];
            }
        }

        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                for (int h = -1; h < i; h++){ 
                    for (int w = -1; w < j; w++){ 
                        int sum = presum[i][j];
                        if (h >= 0) sum -= presum[h][j];
                        if (w >= 0) sum -= presum[i][w];
                        if (h >= 0 && w >= 0) sum += presum[h][w];
                        if (sum == target) ans++;
                    }
                }
            }
        }
        return ans;
    }
}