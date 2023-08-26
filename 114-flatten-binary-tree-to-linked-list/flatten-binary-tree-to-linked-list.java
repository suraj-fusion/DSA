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
    public void flatten(TreeNode root) {

        ArrayList<Integer> pre = new ArrayList<Integer>();

        preorder(pre,root);
        
        TreeNode temp=root;
        for(int i=1;i<pre.size();i++)
        {
            temp.right=new TreeNode(pre.get(i));
            temp.left=null;
            temp=temp.right;
        }

        
        
    }


    static void preorder(ArrayList<Integer> pre,TreeNode root)
    {
         
         if(root==null)
         {
             return;
         }
         pre.add(root.val);
         preorder(pre,root.left);
         preorder(pre,root.right);

    }
}