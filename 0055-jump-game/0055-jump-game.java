class Solution {
    public boolean canJump(int[] nums) {
        int fp=nums.length-1;
        for(int idx=nums.length-2;idx>=0;idx--){
            if(idx+nums[idx]>=fp){
                fp=idx;
            }
        }
        return fp==0;

        
    }
}