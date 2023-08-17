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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode temp1=list1;
        ListNode temp2=list2;
        ListNode head=null;
        ListNode temp=head;
        while(temp1!=null && temp2!=null)
        {
             if(temp1.val<=temp2.val)
             {
                  if(head==null)
                  {
                      head=new ListNode(temp1.val);
                      temp=head;
                  }
                  else
                  {
                      temp.next=new ListNode(temp1.val);
                      temp=temp.next;
                  }
                  temp1=temp1.next;
             }
             else
             {
                     if(head==null)
                  {
                      head=new ListNode(temp2.val);
                      temp=head;
                  }
                  else
                  {
                      temp.next=new ListNode(temp2.val);
                      temp=temp.next;
                  }
                  temp2=temp2.next;
             }


             
        }

        while( temp1!=null )
        {
              if(head==null)
                  {
                      head=new ListNode(temp1.val);
                      temp=head;
                  }
                  else
                  {
                      temp.next=new ListNode(temp1.val);
                      temp=temp.next;
                  }

                   temp1=temp1.next;
        }

        while(temp2!=null )
        {
                 if(head==null)
                  {
                      head=new ListNode(temp2.val);
                      temp=head;
                  }
                  else
                  {
                      temp.next=new ListNode(temp2.val);
                      temp=temp.next;
                  }

                   temp2=temp2.next;
        }
        return head;
    }
}