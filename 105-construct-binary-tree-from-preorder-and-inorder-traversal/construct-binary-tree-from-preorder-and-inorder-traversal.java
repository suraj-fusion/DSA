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

      TreeNode root=  build(preorder,inorder,0,preorder.length-1,0,inorder.length-1);
      return root;
        
    }

   TreeNode build(int preorder[],int inorder[],int prelow,int prehigh,int inlow,int inhigh)
    {
       if(prelow>prehigh)
       {
           return null;
       }

       TreeNode root=new TreeNode(preorder[prelow]);
       int k=inlow;
       while(true)
       {
           if(inorder[k]==root.val)
           {
            break;
           }
           k++;
       }
     
      int ebk=k-inlow;
      int efk=inhigh-k;
      root.left=build(preorder,inorder,prelow+1,prelow+ebk,inlow,k-1);
      root.right=build(preorder,inorder,prelow+ebk+1,prelow+ebk+efk,k+1,inhigh);
      return root;
      

    }


}