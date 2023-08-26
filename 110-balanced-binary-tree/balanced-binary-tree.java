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
    public boolean isBalanced(TreeNode root) {

        if(root==null)
        {
            return true;
        }

        boolean ans= Math.abs(Height(root.left)-Height(root.right) )<=1;

        return ans && isBalanced(root.left) && isBalanced(root.right);
        
    }


    static int Height(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }

        return 1 + Math.max(Height(root.left),Height(root.right));
    }
}