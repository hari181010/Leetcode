class Solution {
    public int lengthOfLastWord(String s) {
        String[] w=s.split("\\s+");
        return w[w.length-1].length();
    }
}