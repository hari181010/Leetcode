class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> resu=new ArrayList<>();
        int s=nums.length;
        if(nums==null || s==0||s<4) return resu;
        Arrays.sort(nums);
        for(int i=0;i<s;i++)
        {
            long t1=target-nums[i];
        
            for(int j=i+1;j<s;j++)
            {
                long t2=t1-nums[j];

                int l=j+1,r=s-1;
                while(l<r){
                long  sum=(long)nums[l]+(long)nums[r];
                if(sum<t2){
                    l++;}
                else if(sum>t2)
                {
                    r--;
                }
                else{
                    List<Integer> res=new ArrayList<>();
                    res.add(nums[i]);res.add(nums[j]);res.add(nums[l]);res.add(nums[r]);
                    resu.add(res);
                    l++;
                    r--;
                    while(l<r && nums[l]==res.get(2)) ++l;
                    while(l<r && nums[r]==res.get(3)) --r;
                  
                }
            }
            while(j+1 <s && nums[j+1]==nums[j]) ++j;

            }
            while(i+1<s && nums[i+1]==nums[i]) ++i;

        }
        return resu;

        
    }
}