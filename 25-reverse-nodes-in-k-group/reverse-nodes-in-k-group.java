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
    public ListNode reverseKGroup(ListNode head, int k) {

        ArrayList<Integer> al = new ArrayList<Integer> ();

        ListNode temp=head;
        while(temp!=null)
        {
            al.add(temp.val);
            temp=temp.next;
        }


       int low=0;
       while(true)
       {
       
        int high=low+k-1;
        if(high>al.size()-1)
        {
          break;
        }
       int temp4=high;
        while(low<high)
        {
            int temp12=al.get(low);
            al.set( low,al.get(high) );
            al.set( high,temp12 );
            low++;
            high--;
        }
        low=temp4+1;
       }
       
       ListNode nhead=new ListNode(al.get(0));
    
       ListNode temp3=nhead;
       for(int i=1;i<al.size();i++)
       { 
            temp3.next= new ListNode(al.get(i));
            temp3=temp3.next;
       }

       return nhead;
     

    }
}