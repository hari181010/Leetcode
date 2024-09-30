class Solution {
    public int searchInsert(int[] nums, int target) {
        int a=0;
        for(int i:nums)
        {
            if(i<target)
            {
                i++;
                a++;
                
            }
        }
        return a;
        
    }
}