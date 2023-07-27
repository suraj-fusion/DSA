/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        StringBuilder res= new StringBuilder();
        ListNode temp=head;
        while(temp!=null)
        {
            res.append(temp.val);
            temp=temp.next;       
        }
         String res2=res.toString();
        String rev="";
        for(int i=0;i<res.length();i++)
        {
            rev=res2.charAt(i)+rev;        
        }

        if(res2.equals(rev))
        {
            return true;
        }
        else
        {
            return false;
        }
        
       
    }
}