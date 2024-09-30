class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int[][] d=new int[m][n];

        for(int i=0;i<n;i++){
            if(obstacleGrid[0][i]==0){
                d[0][i]=1;
            }
            else{
                break;
            }
        }
        for(int i=0;i<m;i++){
            if(obstacleGrid[i][0]==0){
                d[i][0]=1;
            }
            else{
                break;
            }
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(obstacleGrid[i][j]==1){
                    continue;
                }
                d[i][j]=d[i-1][j]+d[i][j-1];
            }
        }
        return d[m-1][n-1];
        
    }
}