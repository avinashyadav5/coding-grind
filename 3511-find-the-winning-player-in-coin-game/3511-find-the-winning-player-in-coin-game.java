class Solution {
    public String winningPlayer(int x, int y) {
        for (int turn = 0; ; turn++) {
            if (x >= 1 && y >= 4) {
                x -= 1;
                y -= 4;
            } 
            else {
               if(turn % 2 == 0)
               return "Bob";
               else
                return "Alice";
            }
        }
    }
}