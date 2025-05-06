class Solution {
    public String reverseWords(String s) {
         s = s.trim();
        int[] wordIndexes = new int[s.length()];
        int wordCount = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 || (s.charAt(i) != ' ' && s.charAt(i - 1) == ' ')) {
                wordIndexes[wordCount++] = i;
            }
        }
        
        String result = "";
        for (int i = wordCount - 1; i >= 0; i--) {
            int start = wordIndexes[i];
            int end = (i == wordCount - 1) ? s.length() : wordIndexes[i + 1];
            String word = s.substring(start, end).trim();
            if (i != wordCount - 1) {
                result += " ";
            }
            result += word;
        }
        
        return result;
    }
}