class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) 
        return "";
        String s = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < s.length()) {
                s = strs[i];
            }
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            for (int j = 0; j < strs.length; j++) {
                if (strs[j].charAt(i) != ch) {
                    return s.substring(0, i);
                }
            }
        }
        return s;
    }
}