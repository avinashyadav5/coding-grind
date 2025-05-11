class Solution {
    public boolean isValidSudoku(char[][] board) {

         for (int i = 0; i < 9; i++) {
            if (!isValidGroup(board[i])) return false;
        }

        for (int j = 0; j < 9; j++) {
            char[] col = new char[9];
            for (int i = 0; i < 9; i++) {
                col[i] = board[i][j];
            }
            if (!isValidGroup(col)) return false;
        }

        for (int boxRow = 0; boxRow < 3; boxRow++) {
            for (int boxCol = 0; boxCol < 3; boxCol++) {
                char[] box = new char[9];
                int idx = 0;
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        box[idx++] = board[boxRow * 3 + i][boxCol * 3 + j];
                    }
                }
                if (!isValidGroup(box)) return false;
            }
        }

        return true;
    }

    private boolean isValidGroup(char[] group) {
        boolean[] seen = new boolean[9];
        for (char c : group) {
            if (c != '.') {
                int num = c - '1';
                if (seen[num]) return false;
                seen[num] = true;
            }
        }
        return true;
    }
}