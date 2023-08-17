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
        if(list1==null && list2==null) return null;
        if(list1==null) return list2;
        if(list2==null) return list1;
        ListNode l1;
        ListNode l2;
        ListNode res;
        if(list1.val<=list2.val)
        {
            l1=list1;
            l2=list2;
        }
        else
        {
            l1=list2;
            l2=list1;
        }
        res=l1;

        while(l1!=null && l2!=null)
        {
            ListNode temp=null;
            while(l1!=null && l1.val<=l2.val)
            {
                temp=l1;
                l1=l1.next;
            }

            if(temp!=null)
             temp.next=l2;
            ListNode swap=l1;
            l1=l2;
            l2=swap;
        }

        return res;
    }
}