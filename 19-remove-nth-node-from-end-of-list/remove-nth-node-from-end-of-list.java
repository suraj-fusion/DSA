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
    public ListNode removeNthFromEnd(ListNode head, int n) {
      
      int l=0;
      ListNode temp=head;
      while(temp!=null)
      {
          l++;
          temp=temp.next;
      }

      int f=l-n+1;

      ListNode temp2=head;
      ListNode prev=null;
      int x=1;
      while(x!=f )
      {
          x++;
          prev=temp2;
          temp2=temp2.next;
      }

      if(prev==null)
      {
          head=temp2.next;
      }
     else 
      {
      prev.next=temp2.next;
      
      }
      return head;


        
    }
}