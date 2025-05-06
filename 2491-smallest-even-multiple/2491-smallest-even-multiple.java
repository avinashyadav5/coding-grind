class Solution {
    public int smallestEvenMultiple(int n) {
        int a = 2;
        int b = n;
        int lcm = (a * b) / gcd(a, b);
        return lcm;
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}