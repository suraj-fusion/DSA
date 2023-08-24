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
    public boolean isSymmetric(TreeNode root) {
        
            return isSymmetrical(root.left,root.right);
            
    }
    boolean isSymmetrical(TreeNode left,TreeNode right)
    {
        if(left==null || right==null)
        {
            return left==right;
        }

        if(left.val!=right.val) return false;

        return isSymmetrical(left.left,right.right) && isSymmetrical(left.right,right.left);
    }


}