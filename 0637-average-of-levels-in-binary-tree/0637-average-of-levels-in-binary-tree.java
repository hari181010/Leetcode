/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
         List<Double> res=new ArrayList();
        if(root==null){
            return res;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int s=q.size();
            double avg=0;
            List<Integer> l=new ArrayList();
            for(int i=0;i<s;i++){
                TreeNode curr=q.poll();
                avg+=curr.val;
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){

                    q.add(curr.right);
                }
            }
            avg=avg/s;
            res.add(avg);

        }
        return res;
    }
        
    
}