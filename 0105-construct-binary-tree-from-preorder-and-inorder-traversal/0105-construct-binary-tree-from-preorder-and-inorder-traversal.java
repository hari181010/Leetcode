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



    private TreeNode split(int[] preorder,Map<Integer,Integer> m,int ri,int l,int r){
        TreeNode root=new TreeNode(preorder[ri]);
        int mid=m.get(preorder[ri]);
        if(mid>l)root.left=split(preorder,m,ri+1,l,mid-1);
        if(mid<r) root.right=split(preorder,m,ri+mid-l+1,mid+1,r);
        return root;
        
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<inorder.length;i++)
            m.put(inorder[i],i);
        return split(preorder,m,0,0,inorder.length-1);
        
        
    }
}