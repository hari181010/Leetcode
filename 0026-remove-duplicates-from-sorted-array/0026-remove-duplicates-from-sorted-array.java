class Solution {
    public int removeDuplicates(int[] nums) {
        int r=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[r]!=nums[i]){
            r++;
            nums[r]=nums[i];
            }
        }
        
        return r+1;

        
    }
}