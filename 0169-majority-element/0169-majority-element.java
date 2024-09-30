class Solution {
    public int majorityElement(int[] nums) {
        int m=nums[0];
        int c=1;
        for(int i=1;i<nums.length;i++)
        {
            if(c==0)
            {
                c=1;
                m=nums[i];
                continue;
            }
            if(nums[i]==m)
            c++;
            else
            c--;
        }
        return m;
        
    }
}