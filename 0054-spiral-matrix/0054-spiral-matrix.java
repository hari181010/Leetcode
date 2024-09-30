class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> res=new ArrayList();
        if(matrix.length==0) return res;
        int rowb=0;
        int rowe=matrix.length-1;
        int colb=0;
        int cole=matrix[0].length-1;

        while(rowb<=rowe && colb<=cole){
            for(int i=colb;i<=cole;i++){
                res.add(matrix[rowb][i]);
            }
            rowb++;
            for(int i=rowb;i<=rowe;i++){
                res.add(matrix[i][cole]);
            }
            cole--;
            if(rowb<=rowe){
                for(int i=cole;i>=colb;i--){
                    res.add(matrix[rowe][i]);
                }
            }
            rowe--;
            if(colb<=cole){
                for(int i=rowe;i>=rowb;i--){
                    res.add(matrix[i][colb]);
                }
            }
            colb++;
        }
        return res;
        
    }
}