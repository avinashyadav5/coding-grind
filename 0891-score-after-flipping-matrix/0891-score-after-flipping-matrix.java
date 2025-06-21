class Solution {
    public void flipRow(int grid[][], int row) {
        for (int j = 0; j < grid[0].length; j++) {
            grid[row][j] = 1 - grid[row][j];
        }
    }

    public void flipCol(int grid[][], int col) {
        for (int i = 0; i < grid.length; i++) {
            grid[i][col] = 1 - grid[i][col];
        }
    }

    public int countOneInCol(int grid[][], int col) {
        int countOne = 0;
        for (int i = 0; i < grid.length; i++) {
            if (grid[i][col] == 1) {
                countOne++;
            }
        }
        return countOne;
    }

    public int convertRowToNum(int row[]) {
        int num = 0;
        for (int i = 0; i < row.length; i++) {
            num = num * 2 + row[i];
        }
        return num;
    }

    public int matrixScore(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            if (grid[i][0] == 0) {
                flipRow(grid, i);
            }
        }

        for (int j = 1; j < grid[0].length; j++) {
            int countOneInCol = countOneInCol(grid, j);
            if (countOneInCol * 2 < grid.length) {
                flipCol(grid, j);
            }
        }

        int totalSum = 0;
        for (int j = 0; j < grid.length; j++) {
            totalSum += convertRowToNum(grid[j]);
        }

        return totalSum;
    }
}