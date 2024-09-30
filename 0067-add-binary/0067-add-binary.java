class Solution {
    public String addBinary(String a, String b) {
        int al=a.length();
        int bl=b.length();
        int i=0,c=0;
        StringBuilder  res=new StringBuilder();
        while(i<al || i<bl || c!=0)
        {
            int x=0;
            if(i<al && a.charAt(al-i-1)=='1')
            {
                x=1;
            }
            int y=0;
            if(i<bl && b.charAt(bl-i-1)=='1')
            {
                y=1;
            }
            res.insert(0,(x+y+c)%2);
            c=(x+y+c)/2;
            i+=1;
        }
        return res.toString();
        
    }
}