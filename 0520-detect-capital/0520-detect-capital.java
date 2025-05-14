class Solution {
    public boolean detectCapitalUse(String word) {
        int upper = 0;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                upper++;
            }
        }
        // Case 1: All letters are uppercase
        if (upper == word.length())
            return true;

        // Case 2: All letters are lowercase
        if (upper == 0)
            return true;

        // Case 3: Only the first letter is uppercase
        if (upper == 1 && word.charAt(0) >= 'A' && word.charAt(0) <= 'Z')
            return true;

        // All other cases are invalid
        return false;
    }
}