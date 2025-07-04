class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {
            ".-","-...","-.-.","-..",".","..-.","--.","....","..",
            ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
            "...","-","..-","...-",".--","-..-","-.--","--.."
        };

        String[] seen = new String[words.length];
        int uniqueCount = 0;

        for (int i = 0; i < words.length; i++) {
            String code = "";
            for (int j = 0; j < words[i].length(); j++) {
                code = code + morse[words[i].charAt(j) - 'a'];
            }

            int k;
            for (k = 0; k < uniqueCount; k++) {
                if (seen[k].equals(code)) {
                    break;
                }
            }

            if (k == uniqueCount) {
                seen[uniqueCount] = code;
                uniqueCount++;
            }
        }
        return uniqueCount;
    }
}
