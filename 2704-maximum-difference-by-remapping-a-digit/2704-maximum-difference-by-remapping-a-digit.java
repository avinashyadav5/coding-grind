class Solution {
    public int minMaxDifference(int n) {
        String s = Integer.toString(n);
        char[] high = s.toCharArray();
        char[] low = s.toCharArray();

        char toNine = 0;
        for (char ch : high) {
            if (ch != '9') {
                toNine = ch;
                break;
            }
        }

        for (int i = 0; i < high.length; i++) {
            if (high[i] == toNine) {
                high[i] = '9';
            }
        }

        char toZero = low[0];
        for (int i = 0; i < low.length; i++) {
            if (low[i] == toZero) {
                low[i] = '0';
            }
        }
        int maxNum = Integer.parseInt(new String(high));
        int minNum = Integer.parseInt(new String(low));

        return maxNum - minNum;
    }
}
