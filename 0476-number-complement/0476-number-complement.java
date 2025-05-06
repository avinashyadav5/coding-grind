class Solution {
    public int findComplement(int num) {
        int sum=0;
        String binary = "";
        while (num > 0) {
            binary = (num % 2) + binary;
            num /= 2;
        }
        String st="";
        for(int i=0;i<binary.length();i++)
        {
            char ch=binary.charAt(i);
            if(ch=='0')
            st+="1";
            else
            st+="0";
        }
        int decimal = 0;
        int base = 1;
        for (int i = st.length() - 1; i >= 0; i--) {
            if (st.charAt(i) == '1') {
                decimal += base;  
            }
            base *= 2;
        }
        return decimal;
    }
}