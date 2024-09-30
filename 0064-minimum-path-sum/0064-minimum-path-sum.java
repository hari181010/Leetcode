class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][]d=new int[m][n];
        int s=0;
        for(int i=0;i<m;i++){
            s+=grid[i][0];
            d[i][0]=s;
        }
        s=0;
        for(int i=0;i<n;i++){
            s+=grid[0][i];
            d[0][i]=s;
        }
        if(m>0 && n==1){
            return d[m-1][0];
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                d[i][j]=Math.min(d[i-1][j],d[i][j-1])+grid[i][j];
            }
        }
        return d[m-1][n-1];
        
    }
}