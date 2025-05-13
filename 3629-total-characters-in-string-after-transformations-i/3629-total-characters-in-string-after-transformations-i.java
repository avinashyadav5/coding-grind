class Solution {
    public int lengthAfterTransformations(String s, int t) {
        final int MOD = 1_000_000_007;
        long[] freq = new long[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        for (int step = 0; step < t; step++) {
            long[] nextFreq = new long[26];
            for (int i = 0; i < 25; i++) {
                nextFreq[i + 1] = (nextFreq[i + 1] + freq[i]) % MOD;
            }
            nextFreq[0] = (nextFreq[0] + freq[25]) % MOD;
            nextFreq[1] = (nextFreq[1] + freq[25]) % MOD; 
            freq = nextFreq;
        }
        long totalLen = 0;
        for (long count : freq) {
            totalLen = (totalLen + count) % MOD;
        }
        return (int) totalLen;
    }
}