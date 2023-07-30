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
    public List<List<Integer>> levelOrder(TreeNode root) {

       
       List<List<Integer>> ans = new ArrayList();
       if(root==null)
       {
           return ans;
       }
       Queue<TreeNode> q= new LinkedList<TreeNode>();
       q.add(root);
       while(!q.isEmpty())
       {
         
         int currsize=q.size();
         ArrayList<Integer> al=new ArrayList<Integer>();
         for(int i=0;i<currsize;i++)
         {

           TreeNode x=q.remove();
          
           if(x.left!=null)
           {
                 q.add(x.left);
           }
            if(x.right!=null)
           {
                 q.add(x.right);
           }
           al.add(x.val);

         }
         ans.add(al);

       }
       return ans;
      


        
    }
}