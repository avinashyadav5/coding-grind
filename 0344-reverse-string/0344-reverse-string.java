class Solution {
    public void reverseString(char[] s) {
        int d = s.length - 1;
        char a[] = new char[s.length];
        for (int i = 0; i < s.length; i++) {
            a[d] = s[i];
            d--;
        }
        for (int i = 0; i < s.length; i++) {
            s[i] = a[i];
        }
    }
}
