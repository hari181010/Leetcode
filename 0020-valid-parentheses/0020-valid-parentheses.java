class Solution {
    public char g(char ch)
    {
        switch(ch)
        {
            case '}':return '{';
            case ']':return '[';
            case ')':return '(';
            default:return ' ';
        }
    }
    public boolean isValid(String s) {
        String o="{[(";
        String c="})]";
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray())
        {
            if(o.indexOf(ch)!=-1)
            {
                st.push(ch);
            }
            else
            {
                if(st.size()==0) return false;
                char tp=st.pop();
                if(g(ch)!=tp)
                {
                    return false;
                }
            }

        }
        return st.size()==0;
        
    }
}