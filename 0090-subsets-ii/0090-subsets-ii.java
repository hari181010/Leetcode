class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        back(res,new ArrayList<>(),nums,0);
        return res;
        
    }

    private void back(List<List<Integer>> res,List<Integer> temp,int [] nums,int s){
        if(res.contains(temp))
        return;
        res.add(new ArrayList<>(temp));
        for(int i=s;i<nums.length;i++){
            temp.add(nums[i]);
            back(res,temp,nums,i+1);
            temp.remove(temp.size()-1);
        }

    }


}