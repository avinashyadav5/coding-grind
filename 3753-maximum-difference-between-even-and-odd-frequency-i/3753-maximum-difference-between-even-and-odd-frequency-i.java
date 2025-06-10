class Solution {
    public int maxDifference(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int maxOddFreq = -1;
        int minEvenFreq = Integer.MAX_VALUE;
        for (int freq : map.values()) {
            if (freq % 2 == 1) {
                maxOddFreq = Math.max(maxOddFreq, freq);
            } else {
                minEvenFreq = Math.min(minEvenFreq, freq);
            }
        }
        if (maxOddFreq == -1 || minEvenFreq == Integer.MAX_VALUE) {
            return -1;
        }
        return maxOddFreq - minEvenFreq;
    }
}