class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res=nums[0]+nums[1]+nums[2];
        int mind=Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++)
        {
            int l=i+1;
            int r=nums.length-1;

            while(l<r)
            {
                int sum=nums[i]+nums[l]+nums[r];
                if(sum==target)
                return target;
                if(sum<target)
                l++;
                else
                r--;

                int diff=Math.abs(sum-target);
                if(diff<mind)
                {
                    res=sum;
                    mind=diff;
                }
            }
        }
        return res;
        
    }
}