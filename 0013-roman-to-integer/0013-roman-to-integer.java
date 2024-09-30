class Solution {
    public int gv(char c)
    {
        switch(c)
        {
            case 'I':return 1;
            case 'V':return 5;
            case 'X':return 10;
            case 'L':return 50;
            case 'C':return 100;
            case 'D':return 500;
            case 'M':return 1000;
            default :return 0;
        }
    }
    public int romanToInt(String s) {
        int sum=0;
        int n=s.length();
        for(int i=0;i<n;i++)
        {
           char c=s.charAt(i);
           if(((i+1)<n)&& gv(c)<gv(s.charAt(i+1)))
           sum-=gv(c);
           else
           sum+=gv(c);
           

        }
        return sum;
        
    }
}