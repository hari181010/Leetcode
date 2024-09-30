class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list=new ArrayList<>();
        boolean in=false;
        for(int []i:intervals){
            if(i[0]>newInterval[0]&& !in){
                list.add(newInterval);
                in=true;
            }
            list.add(i);
        }
        if(list.size()==intervals.length) list.add(newInterval);
        return solv(list);



        
    }

    public int[][] solv(List<int[]> intervals){
        List<int[]> res=new ArrayList<>();
        int start=intervals.get(0)[0];
        int end=intervals.get(0)[1];
        for(int i=1;i<intervals.size();i++){
            if(intervals.get(i)[0]<=end){
                end=Math.max(intervals.get(i)[1],end);
            }
            else{
                int[] arr={start,end};
                res.add(arr);
                start=intervals.get(i)[0];
                end=intervals.get(i)[1];

            }
        }
        int []arr={start,end};
        res.add(arr);
        int [][]ans=new int[res.size()][2];
        for(int i=0;i<res.size();i++){
            ans[i][0]=res.get(i)[0];
            ans[i][1]=res.get(i)[1];
        }
        return ans;
    }
}