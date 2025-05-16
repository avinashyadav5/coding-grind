class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] answer = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int rStart = Math.max(0, i - k);
                int rEnd = Math.min(m - 1, i + k);
                int cStart = Math.max(0, j - k);
                int cEnd = Math.min(n - 1, j + k);
                int sum = 0;
                for (int r = rStart; r <= rEnd; r++) {
                    for (int c = cStart; c <= cEnd; c++) {
                        sum += mat[r][c];
                    }
                }
                answer[i][j] = sum;
            }
        }
        return answer;
    }
}