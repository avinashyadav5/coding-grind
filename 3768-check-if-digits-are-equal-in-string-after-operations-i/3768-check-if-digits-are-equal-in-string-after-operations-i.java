class Solution {
    public boolean hasSameDigits(String s) { 
        while (s.length() > 2) {
            String str = "";
            for (int i = 0; i < s.length() - 1; i++) {
                int sum = (s.charAt(i) - '0') + (s.charAt(i + 1) - '0');
                str += (sum % 10);
            }
            s = str;
        }
        return s.charAt(0) == s.charAt(1);
    }
}