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
       q.add(null);
       ArrayList<Integer> al=new ArrayList<Integer>();
       while(q.size()>1)
       {
           TreeNode x=q.remove();
           if(x==null)
           {
              ans.add(al);
              al=new ArrayList<Integer>();
              q.add(null);
           }
           else
           {
                al.add(x.val);
           }


           if(x!=null && x.left!=null)
           {
               q.add(x.left);
           }
            if(x!=null && x.right!=null)
           {
               q.add(x.right);
           }
       }
       ans.add(al);
       

       return ans;


        
    }
}