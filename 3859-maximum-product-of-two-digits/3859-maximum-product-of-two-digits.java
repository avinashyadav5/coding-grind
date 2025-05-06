import java.util.Arrays;

class Solution {
    public int maxProduct(int n) {
        int[] dig = new int[10];
        int len = 0;

        while (n > 0) {
            dig[len++] = n % 10;
            n /= 10;
        }

        Arrays.sort(dig, 0, len);
        int max = dig[len - 1] * dig[len - 2];
        if (dig[len - 1] == dig[len - 2]) {
            return max;
        }

        for (int i = len - 3; i >= 0; i--) {
            if (dig[i] == dig[len - 1]) {
                return Math.max(max, dig[len - 1] * dig[len - 1]);
            }
        }
        return max;
    }
}
