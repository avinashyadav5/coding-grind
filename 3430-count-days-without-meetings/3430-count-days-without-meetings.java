class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, (a, b) -> a[0] - b[0]);
        int available = 0;
        int l = 0;
        for (int[] meeting : meetings) {
            int start = meeting[0];
            int end = meeting[1];
            if (start > l + 1) {
                available += start - l - 1;
            }
            l = Math.max(l, end);
        }
        if (l < days) {
            available += days - l;
        }
        return available;
    }
}