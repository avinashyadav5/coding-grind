class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String str="";
        //String st=s;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='a'&&s.charAt(i)<='z'||s.charAt(i)>='0'&&s.charAt(i)<='9')
            str+=s.charAt(i);
        }
        String t="";
        for(int i=str.length()-1;i>=0;i--)
        {
            char ch=str.charAt(i);
            t+=ch;
        }
        return (str.equals(t));
    }
}