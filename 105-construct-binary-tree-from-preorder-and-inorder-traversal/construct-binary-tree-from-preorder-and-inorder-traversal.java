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
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        int i[]=new int[1];
        i[0]=0;
        TreeNode root= build(preorder,inorder, i , 0 , inorder.length-1);
        return root;
        
    }

    TreeNode build(int preorder[] ,int inorder[],int i[],int l,int h )
    {
         if(l>h || i[0]>=preorder.length)
         {
             return null;
         }
         TreeNode root=new TreeNode(preorder[ i[0] ] );
         i[0]++;
         int k=l;
         for( ;k<=h;k++)
         {
             if(inorder[k]==root.val)
             {
                break;  
                 
             }
         }

    
         root.left=build(preorder,inorder,i,l,k-1);
        
    
         root.right=build(preorder,inorder,i,k+1,h);

         return root;

    }


}