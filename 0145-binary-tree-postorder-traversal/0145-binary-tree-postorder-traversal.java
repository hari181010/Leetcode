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
    public List<Integer> help(TreeNode root,LinkedList<Integer> li){
        if(root==null) return li;
        help(root.left,li);
        help(root.right,li);
        li.add(root.val);
        return li;
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> li=new LinkedList<>();
        return help(root,li);
        
    }
}