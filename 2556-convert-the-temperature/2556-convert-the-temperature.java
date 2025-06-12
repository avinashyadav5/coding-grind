class Solution {
    public double[] convertTemperature(double celsius) {
        double t[] = new double[2];
        t[0]=celsius+273.15;
        t[1]=celsius*1.80+32.00;
        return t;
    }
}