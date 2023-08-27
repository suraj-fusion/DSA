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
    public int diameterOfBinaryTree(TreeNode root) {
        
        if(root==null)
        {
            return 0;
        }
        int lh=Height(root.left);
        int rh=Height(root.right);

         int t =Math.max(diameterOfBinaryTree(root.left),lh+rh);
         return Math.max(t,diameterOfBinaryTree(root.right));
        
    }

    int Height(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }

        return 1+ Math.max(Height(root.left),Height(root.right));
    }
}