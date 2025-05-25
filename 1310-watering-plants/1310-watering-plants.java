class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int c = 0;
        int againCap = capacity;
        for (int i = 0; i < plants.length; i++) {
            if (plants[i] <= capacity) {
                capacity -= plants[i];
                c += 1;
            } else {
                c += i*2+1;
                capacity = againCap - plants[i];
            }
        }
        return c;
    }
}