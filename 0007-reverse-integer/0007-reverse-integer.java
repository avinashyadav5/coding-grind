class Solution {
    public int reverse(int x) {
        int rev = 0;
        int MAX = 2147483647;
        int MIN = -2147483648;
        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            if (rev > MAX / 10 || (rev == MAX / 10 && digit > 7)) {
                return 0;
            }
            if (rev < MIN / 10 || (rev == MIN / 10 && digit < -8)) {
                return 0;
            }
            rev = rev * 10 + digit;
        }
        return rev;
    }
}