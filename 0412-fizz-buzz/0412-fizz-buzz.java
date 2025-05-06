class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> a = new ArrayList<>(); 
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                a.add("FizzBuzz");
            } else if (i % 3 == 0) {
                a.add("Fizz");
            } else if (i % 5 == 0) {
                a.add("Buzz");
            } else {
                a.add(String.valueOf(i));
            }
        }
        return a;
    }
}