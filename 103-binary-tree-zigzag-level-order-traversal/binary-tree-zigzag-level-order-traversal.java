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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> ans=new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        if(root==null)
        {
            return ans;
        }
        q.add(root);
        int c=0;
        while(!q.isEmpty())
        {
            ArrayList<Integer> al = new ArrayList<Integer>();
            int size=q.size();
            for(int i=0;i<size;i++)
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
             c++;
            if(c%2==1)
            {
                ans.add(al);
            }
            else
            {
               Collections.reverse(al);
               ans.add(al);
            }
         
        }

        return ans;


        
    }
}