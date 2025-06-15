class Solution {
    public String generateTag(String caption) {
        int n = caption.length();
        String s = "#";
        for (int i = 0; i < n; i++) {
            char ch=caption.charAt(i);
            if (s.length() == 1 && ch!=' ') {
                s += Character.toLowerCase(ch);
            } 
            else {
                if (ch == ' ')
                    continue;

                if (i > 0 && caption.charAt(i - 1) == ' ') {
                    s += Character.toUpperCase(ch);
                } 
                else {
                    s += Character.toLowerCase(ch);
                }
            }
        }
        if (s.length() > 100)
            return s.substring(0, 100);
        else
            return s;
    }
}