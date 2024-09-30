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
    public List<TreeNode> help(int s,int e){
        List<TreeNode> li=new ArrayList<>();
        if(s>e){
            li.add(null);
            return li;
        }
        if(s==e){
            li.add(new TreeNode(s));
            return li;
        }
        for(int i=s;i<=e;i++){
            List<TreeNode> lt=help(s,i-1);
            List<TreeNode> rt=help(i+1,e);
            for(TreeNode lr:lt){
                for(TreeNode rr:rt ){
                TreeNode root=new TreeNode(i);
                root.left=lr;
                root.right=rr;
                li.add(root);
                }
            }


        }
        return li;
    }
    public List<TreeNode> generateTrees(int n) {
        return help(1,n);
        
    }
}