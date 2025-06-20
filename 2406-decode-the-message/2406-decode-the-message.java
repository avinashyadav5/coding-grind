class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character, Character> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        int asci = 97; 
        
        for (char ch : key.toCharArray()) {
            if (ch >= 'a' && ch <= 'z' && !map.containsKey(ch)) {
                map.put(ch, (char) asci++);
            }
        }

        for (char ch : message.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                sb.append(map.get(ch));
            } else {
                sb.append(ch); 
            }
        }
        return sb.toString();
    }
}