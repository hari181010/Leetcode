class Solution {
    private void back(List<String> l,String c,int open,int close,int max)
    {
        if(c.length()==max*2)
        {
            l.add(c);
            return;
        }
        if(open<max)
        {
            back(l,c+"(",open+1,close,max);
        }
        if(close<open)
        {
            back(l,c+")",open,close+1,max);
        }
        
    }
    public List<String> generateParenthesis(int n) {
        List<String> l=new ArrayList<>();
        back(l,"",0,0,n);
        return l;

        
    }
}