class Solution {
    public boolean isAnagram(String s, String t) {
        String original = "edcba";
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        char[] char1 = t.toCharArray();
        Arrays.sort(char1);
        return Arrays.equals(chars, char1);
    }
}