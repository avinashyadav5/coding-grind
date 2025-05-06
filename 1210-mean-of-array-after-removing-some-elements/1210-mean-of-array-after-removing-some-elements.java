class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int trimCount = (int)(n * 0.05);
        double sum = 0;
        int count = 0;

        for (int i = trimCount; i < n - trimCount; i++) {
            sum += arr[i];
            count++;
        }

        return sum / count;
    }
}