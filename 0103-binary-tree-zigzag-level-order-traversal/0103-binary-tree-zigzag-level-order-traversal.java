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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null) return res;
        boolean rev=false;

        Deque<TreeNode> qu=new LinkedList<>();
        qu.offer(root);
        while(!qu.isEmpty()){
            int l=qu.size();
            List<Integer> cl=new ArrayList<>(l);
            for(int i=0;i<l;i++){
                if(!rev){
                    TreeNode cn=qu.pollFirst();
                    cl.add(cn.val);
                    if(cn.left!=null){
                        qu.addLast(cn.left);
                    }
                    if(cn.right!=null){
                        qu.addLast(cn.right);
                    }
                }
                else{
                    TreeNode cn=qu.pollLast();
                    cl.add(cn.val);
                    if(cn.right!=null){
                        qu.addFirst(cn.right);
                    }
                    if(cn.left!=null){
                        qu.addFirst(cn.left);
                    }

                }
            }
                rev=!rev;
            res.add(cl);
            
        }
        return res;

        
    }
}