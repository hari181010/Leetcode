class Solution {

    private void back(List<List<Integer>> res,ArrayList<Integer> temp,int[] nums){
        if(temp.size()==nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        
        
        
        
        for(int num:nums){
            if(temp.contains(num)) continue;
            temp.add(num);
            back(res,temp,nums);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> res=new ArrayList<>();
        back(res,new ArrayList<>(),nums);
        return res;

        
    }
}