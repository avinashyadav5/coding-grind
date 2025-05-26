class Solution {
    public int minPartitions(String n) {
        int max=0;
        for(int i=0;i<n.length();i++)
        {
            //ASCII digits are subtracted to get in integer
            int a=n.charAt(i)-'0';
            if(max<a)
            max=a;
        }
        return max;
    }
}