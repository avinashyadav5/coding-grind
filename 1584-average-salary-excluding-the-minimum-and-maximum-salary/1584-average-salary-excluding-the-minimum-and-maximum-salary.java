class Solution {
  public double average(int[] salary) {
    int sum = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
    
    for (var s : salary) {
      sum += s;
      min = Math.min(min, s);
      max = Math.max(max, s);
    }
    return (double) (sum - min - max) / (salary.length - 2);
  }
}