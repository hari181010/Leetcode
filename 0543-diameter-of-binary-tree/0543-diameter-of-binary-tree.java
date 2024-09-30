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
    int dia=0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return dia-1;
    }

    int height(TreeNode node){
        if(node==null){
            return 0;
        }

        int lh=height(node.left);
        int rh=height(node.right);
        int di=lh+rh+1;
        dia=Math.max(dia,di);
        return Math.max(lh,rh)+1;
    }
}