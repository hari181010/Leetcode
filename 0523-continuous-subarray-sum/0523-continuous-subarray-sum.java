class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n=nums.length;
        Map<Integer,Integer> rm=new HashMap<>();
        int cs=0;
        rm.put(0,-1);

        for(int i=0;i<n;i++){
            cs+=nums[i];
            int r=(k==0)?cs:cs%k;
            if(rm.containsKey(r)){
                if(i-rm.get(r)>1){
                    return true;
                }
            }
                else{
                    rm.put(r,i);
                }
            
        }
        return false;
        
    }
}