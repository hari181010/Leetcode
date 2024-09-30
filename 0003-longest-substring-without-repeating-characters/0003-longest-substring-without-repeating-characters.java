class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ma=0;
        int start=0;
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);

            if(hm.containsKey(c) && hm.get(c)>=start)
            {
                start=hm.get(c)+1;
            }
            hm.put(c,i);
            ma=Math.max(ma,i-start+1);
        }
        return ma;
        
    }
}