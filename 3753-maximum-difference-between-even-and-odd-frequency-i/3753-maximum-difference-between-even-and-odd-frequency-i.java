class Solution {
    public int maxDifference(String s) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }
        int maxOdd = -1;
        int minEven = Integer.MAX_VALUE;
        for (int i = 0; i < 26; i++) {
            int f = freq[i];
            if (f == 0)
                continue;

            if (f % 2 == 1) {
                maxOdd = Math.max(maxOdd, f);
            } else {
                minEven = Math.min(minEven, f);
            }
        }
        if (maxOdd == -1 || minEven == Integer.MAX_VALUE)
            return -1;
        else
            return maxOdd - minEven;
    }
}
