class Solution {
    public int countOdds(int low, int high) {
        if (low % 2 != 0 && high % 2 != 0) {
            return (high - low) / 2 + 1;
        } else {
            return (high - low) / 2+((low % 2 == 0 && high % 2 != 0)||(low % 2 != 0 && high % 2 == 0)?1:0);
        }
    }
}