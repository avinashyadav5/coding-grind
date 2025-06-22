class Solution {
    public String[] divideString(String s, int k, char fill) {
        int remainder = s.length() % k;
        if (remainder != 0) {
            int toFill = k - remainder;
            StringBuilder sb = new StringBuilder(s);
            for (int i = 0; i < toFill; i++) {
                sb.append(fill);
            }
            s = sb.toString();
        }

        int parts = s.length() / k;
        String[] res = new String[parts];
        int index = 0;

        for (int i = 0; i < s.length(); i += k) {
            res[index++] = s.substring(i, i + k);
        }

        return res;
    }
}
