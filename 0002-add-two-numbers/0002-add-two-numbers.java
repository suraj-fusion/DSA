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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode temp1=l1;
        ListNode temp2=l2;
        ListNode anshead=null;
        ListNode anstemp=anshead;
        int carry=0;
        int c=0;
        while(temp1!=null && temp2!=null)
        {
             ListNode newNode=new ListNode( (temp1.val+temp2.val+carry)%10);
             if(c==0)
             {
                 anshead=newNode;
                 anstemp=newNode;
                 c++;
             }
             else
             {
             anstemp.next=newNode;
             anstemp=anstemp.next;
             }

             carry=(temp1.val+temp2.val+carry)/10;
             temp1=temp1.next;
             temp2=temp2.next;
             

        }
        while(temp1!=null)
        {
            ListNode newNode =new ListNode( (temp1.val+carry)%10);
            carry=(temp1.val+carry)/10;
            anstemp.next=newNode;
            anstemp=anstemp.next;
            temp1=temp1.next;
        }
        while(temp2!=null)
        {
            ListNode newNode =new ListNode( (temp2.val+carry)%10);
            carry=(temp2.val+carry)/10;
            anstemp.next=newNode;
            anstemp=anstemp.next;
            temp2=temp2.next;
        }
        if(carry==0)
        {
           
        return anshead;
        }
        else
        {
           
            ListNode newNode=new ListNode(carry);
            anstemp.next=newNode;
            return anshead;
        }

        
    }
}