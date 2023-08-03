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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans=new ArrayList<Integer>();
        
        right(ans,root,0);
        return ans;
        
    }

    void right( List<Integer> ans,TreeNode n,int level)
    {

        if(n==null)
        {
            return;
        }

        if(ans.size()==level)
        {
            ans.add(n.val);
        }

        right(ans,n.right,level+1);
        right(ans,n.left,level+1);
    }
}