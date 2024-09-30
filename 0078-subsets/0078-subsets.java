class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();

        back(res,new ArrayList<>(),nums,0);
        return res;
        
    }
    private void back(List<List<Integer>> res,List<Integer> temp,int[] nums,int s){
        res.add(new ArrayList<>(temp));
        for(int i=s;i<nums.length;i++){
            temp.add(nums[i]);
            back(res,temp,nums,i+1);
            temp.remove(temp.size()-1);
        }
    }
}