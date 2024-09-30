class Solution {
    public int longestConsecutive(int[] nums) {
        int ll=0;
        Map<Integer,Boolean> e=new HashMap<>();
        for(int n:nums){
            e.put(n,Boolean.FALSE);
        }
        for(int n:nums){
            int curr=1;
            int nn=n+1;
            while(e.containsKey(nn) && e.get(nn)==false){
                curr++;
                e.put(nn,Boolean.TRUE);
                nn++;
            }
            int prev=n-1;
            while(e.containsKey(prev) && !e.get(prev)){
                curr++;
                e.put(prev,Boolean.TRUE);
                prev--;
            }
            ll=Math.max(ll,curr);
            
        }
        return ll;
        
    }
}