class Solution {
    public int numUniqueEmails(String[] emails) {
        int n = emails.length;
        for (int i = 0; i < n; i++) {
            String email = emails[i];
            int at = email.indexOf('@');
            String loc = email.substring(0, at);
            String dom = email.substring(at);

            int plus = loc.indexOf('+');
            if (plus != -1) {
                loc = loc.substring(0, plus);
            }

            loc = loc.replace(".", "");
            emails[i] = loc + dom;
        }

        Arrays.sort(emails);

        int uni = 1;
        for (int i = 1; i < n; i++) {
            if (!emails[i].equals(emails[i - 1])) {
                uni++;
            }
        }
        return uni;
    }
}