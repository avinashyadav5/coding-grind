class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        n=n*n;
        w=maxWeight/w;
        if(w<=n)
        {
            return w;
        }
        else 
        return n;
    }
}