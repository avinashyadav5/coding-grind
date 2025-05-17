class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] str = s.split(" ");
        char[] ch = pattern.toCharArray();

        if (str.length != ch.length) 
            return false;

        for(int i=0; i<str.length; i++){
            for(int j= i+1; j<str.length; j++){
                if(ch[i] == ch[j] && !str[i].equals(str[j])){
                    return false;
                }
                if(ch[i] != ch[j] && str[i].equals(str[j])){
                    return false;
                }
            }
        }
        return true;
    }
}