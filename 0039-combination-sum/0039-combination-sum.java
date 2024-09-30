class Solution {


    public void df(int[] candidates,List<List<Integer>> res,int target,List<Integer> li,int start){

         if(target==0){
            res.add(new ArrayList<>(li));
            return;
         }
        for(int i=start;i<candidates.length;i++){
            li.add(candidates[i]);
            int newt=target-candidates[i];
            if(newt>=0){
                df(candidates,res,newt,li,i);
            }
            li.remove(li.size()-1);
        }


    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(candidates);
        df(candidates,res,target,new ArrayList<>(),0);
        return res;
        
        
    }
}