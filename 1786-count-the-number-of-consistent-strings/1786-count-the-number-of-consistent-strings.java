class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] allowedChars = new boolean[26];
        for (int i = 0; i < allowed.length(); i++) {
            char c = allowed.charAt(i);
            allowedChars[c - 'a'] = true;
        }

        int count = 0;
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            boolean consistent = true;
            for (int j = 0; j < word.length(); j++) {
                char ch = word.charAt(j);
                if (allowedChars[ch - 'a'] == false) {
                    consistent = false;
                    break;
                }
            }
            if (consistent == true) {
                count++;
            }
        }
        return count;
    }
}