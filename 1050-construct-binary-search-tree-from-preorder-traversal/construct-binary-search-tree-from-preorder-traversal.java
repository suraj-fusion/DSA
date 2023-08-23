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
    public TreeNode bstFromPreorder(int[] preorder) {

        TreeNode root=new TreeNode(preorder[0]);

        for(int i=1;i<preorder.length;i++)
        {
            TreeNode temp=root;
            while(true)
            {
                if(temp.left==null && preorder[i]<temp.val)
                {
                    temp.left=new TreeNode(preorder[i]);
                    break;
                    
                }
                else if(temp.right==null && preorder[i]>temp.val)
                {
                         temp.right=new TreeNode(preorder[i]);
                         break;
                }
                else if (temp.left !=null && preorder[i]<temp.val)
                {
                    temp=temp.left;
                }
                else if(temp.right!=null && preorder[i]>temp.val)
                {
                    temp=temp.right;
                }
            }
        }

        return root;
        
    }
}