class Solution {
    public int longestPalindrome(String s) {
        int[] freq = new int[128];  
        int length = 0;
        boolean hasOdd = false;

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        for (int i = 0; i < freq.length; i++) {
            length += (freq[i] / 2) * 2;  
            if (freq[i] % 2 != 0) {
                hasOdd = true;           
            }
        }

        if (hasOdd) {
            length += 1;
        }
        
        return length;  
    }
}
