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
       //find the middle of the ll
       ListNode fast=head;
       ListNode slow=head;
       while(fast.next!=null &&  fast.next.next!=null  )
       {
           fast=fast.next.next;
           slow=slow.next;
       }

       ListNode prev=null;
       ListNode temp=slow.next;
       while(temp!=null)
        {
            ListNode n=temp.next;
            temp.next=prev;
            prev=temp;
            temp=n;
        }
        slow.next=prev;
        slow=slow.next;
        ListNode dum=head;
        while(slow!=null)
        {
            if(dum.val!=slow.val)
            {
                  return false;
            }
            slow=slow.next;
            dum=dum.next;
        }
        
        return true;
       
    }
}