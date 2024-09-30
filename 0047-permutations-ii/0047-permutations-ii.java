class Solution {


    public void back(List<List<Integer>> res,ArrayList<Integer> temp,int[] nums,boolean[] use){
        if(temp.size()==nums.length && !res.contains(temp)){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(use[i]) continue;
            use[i]=true;
            temp.add(nums[i]);
            back(res,temp,nums,use);
            use[i]=false;
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {

        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);

        back(res,new ArrayList<>(),nums,new boolean[nums.length]);
        return res;
    }
}