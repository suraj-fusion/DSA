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
    public boolean isSameTree(TreeNode p, TreeNode q) {

              ArrayList<Integer> p1=new ArrayList<Integer>();
              ArrayList<Integer> p2=new ArrayList<Integer>();
              p1=preorder(p,p1);
              p2=preorder(q,p2);

             
             
             if(p1.size()!=p2.size())
             {
                 return false;
             }
            for(int i=0;i<p1.size();i++)
            {
                     if(!Objects.equals(p1.get(i),p2.get(i)))
                     {
                         return false;
                     }  
            }

           return true;
        
    }

    ArrayList<Integer>  preorder(TreeNode root,ArrayList<Integer> ans)
    {
        if(root==null)
        {
            ans.add(null);
            return ans;
        }
        
        ans.add(root.val);
        preorder(root.left,ans);
        preorder(root.right,ans);
        return ans;
    }
}