class Solution {
    public int[][] specialGrid(int N) {
        if (N == 0) {
            return new int[][] { { 0 } };
        }
        int[][] Grid = specialGrid(N - 1);
        int size = 1 << (N - 1); 
        int[][] grid = new int[1 << N][1 << N];
        int quadSize = size * size;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                grid[i][j + size] = Grid[i][j];
                grid[i + size][j + size] = Grid[i][j] + quadSize;
                grid[i + size][j] = Grid[i][j] + 2 * quadSize;
                grid[i][j] = Grid[i][j] + 3 * quadSize;
            }
        }
        return grid;
    }
}