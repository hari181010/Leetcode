class Solution {
    private int expands(String s,int l,int r)
    {
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r))
        {
            l--;
            r++;
        }
        return r-l-1;
    }
    public String longestPalindrome(String s) {
        if(s==null && s.length()<1) return "";
        int start=0,end=0;
        for(int i=0;i<s.length();i++)
        {
            int l1=expands(s,i,i);
            int l2=expands(s,i,i+1);
            int l=Math.max(l1,l2);
            if(l>end-start)
            {
                start=i-(l-1)/2;
                end=i+l/2;
            }
        }
        return s.substring(start,end+1);
        
    }
}