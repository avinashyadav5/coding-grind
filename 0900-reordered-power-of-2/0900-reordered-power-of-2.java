class Solution {
    public boolean reorderedPowerOf2(int n) {
        char[] numArray = String.valueOf(n).toCharArray();
        Arrays.sort(numArray);
        String orderedNum = new String(numArray);

        for (int i = 0; i < 31; i++) {
            int powerNum = (int) Math.pow(2, i);
            char[] powerNumArray = String.valueOf(powerNum).toCharArray();
            Arrays.sort(powerNumArray);
            String orderedPower = new String(powerNumArray);

            if (orderedNum.equals(orderedPower)) {
                return true;
            }
        }
        return false;
    }
}