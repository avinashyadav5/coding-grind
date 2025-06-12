class Solution {
    public int[] minOperations(String boxes) {
        int a[]=new int[boxes.length()];
        for(int i=0;i<boxes.length();i++)
        {
            int sum=0;
            for(int j=0;j<boxes.length();j++)
            {
                char c=boxes.charAt(j);
                if(c!='0')
                sum+=Math.abs(i-j);
            }
            a[i]=sum;
        }
        return a;
    }
}