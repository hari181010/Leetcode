class Solution {
    public int myAtoi(String s) {
        long n = 0;
        char[] ch = s.toCharArray();
        if (ch.length == 0) return 0;
        int i = 0, si = 1;

        // Skip leading whitespaces
        while (i < ch.length && ch[i] == ' ') {
            i++;
        }

        // Handle sign
        if (i < ch.length && (ch[i] == '-' || ch[i] == '+')) {
            si = ch[i] == '-' ? -1 : 1;
            i++;
        }

        // Parse digits
        while (i < ch.length && Character.isDigit(ch[i])) {
            n = n * 10 + (ch[i] - '0');

            // Check for overflow
            if (n * si < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            else if (n * si > Integer.MAX_VALUE) return Integer.MAX_VALUE;

            i++;
        }

        return (int) (n * si);
    }
}
