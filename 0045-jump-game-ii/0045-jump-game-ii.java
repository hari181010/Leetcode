class Solution {
    public int jump(int[] nums) {

        int t=0;
        int des=nums.length-1;
        int cov=0,last=0;

        if(nums.length==1) return 0;

        for(int i=0;i<nums.length;i++){
            cov=Math.max(cov,i+nums[i]);
            if(i==last){
                last=cov;
                t++;

                if(cov>=des){
                    return t;
                }
            }
        }
        return t;
        
    }
}