class Solution {
    public boolean isValid(String s) {
        StringBuilder str = new StringBuilder(s);
        int l = s.length();
        int last = 0;
        for (int i = 0; i < str.length();) {
            if (str.charAt(i) == '(') {
                i++;
            } else if (str.charAt(i) == '[') {
                i++;
            } else if (str.charAt(i) == '{') {
                i++;
            } else {
                if (i == 0) {
                    return false;
                }
                if (str.charAt(i - 1) == '(' && str.charAt(i) == ')' || str.charAt(i - 1) == '[' && str.charAt(i) == ']'
                        || str.charAt(i - 1) == '{' && str.charAt(i) == '}') {
                    str.deleteCharAt(i);
                    str.deleteCharAt(i - 1);
                    i--;
                } else {
                    return false;
                }
                if (str.length() == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}