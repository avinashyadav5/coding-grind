class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0;
        int current = 0;
        int start = 0;

        for (int i = 0; i < gas.length; i++) {
            int gain = gas[i] - cost[i];
            total += gain;
            current += gain;
            if (current < 0) {// If current drops below 0, we cannot start from "start"
                start = i + 1;//move next index
                current = 0;
            }
        }
        if (total >= 0) {
            return start;
        } 
        else {
            return -1; //total amount of gas is less than the total cost
        }
    }
}