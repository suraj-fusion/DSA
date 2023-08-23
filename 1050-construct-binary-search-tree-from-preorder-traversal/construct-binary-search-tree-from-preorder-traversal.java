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

        int i []=new int[1];
        i[0]=0;
        TreeNode root=create(i,preorder,Integer.MAX_VALUE);
        return root;
    }

   static  TreeNode create(int i[],int preorder[],int max)
    {
          if(i[0]==preorder.length || preorder[i[0]]>max)
          {
              return null;
          }

          TreeNode root = new TreeNode(preorder[i[0]]);
          i[0]++;
          root.left=create(i,preorder,root.val);
          root.right=create(i,preorder,max);
          return root;
    }
}