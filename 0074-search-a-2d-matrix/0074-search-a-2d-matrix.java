class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowi=search(matrix,target);
        if(rowi!=-1) return binse(rowi,matrix,target);
        else return false;
    }

    private int search(int [][] matrix,int target){
        int low=0;
        int high=matrix.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(matrix[mid][0]<=target && target<=matrix[mid][matrix[0].length-1]){
                return mid;
            }
            else if(matrix[mid][0]<target) low=mid+1;
            else if(matrix[mid][0]>target) high=mid-1;
        }
        return -1;
    }

    private boolean binse(int row,int[][] matrix,int target){
        int low=0;
        int high=matrix[row].length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(matrix[row][mid]==target) return true;
            else if(matrix[row][mid]> target) high=mid-1;
            else low=mid+1;
        }
        return false;
    }
}