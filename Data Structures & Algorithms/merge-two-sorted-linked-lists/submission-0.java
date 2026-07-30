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
        ListNode ans=new ListNode();
        ListNode h=ans;
        while(list1!=null && list2!=null){
            if(list1.val>=list2.val){
                h.next=list2;
                list2=list2.next;
            }else{
                h.next=list1;
                list1=list1.next;
            }
            h=h.next;
        }
        while(list1!=null){
                h.next=list1;
                list1=list1.next;
                h=h.next;
        }

        while(list2!=null){
                h.next=list2;
                list2=list2.next;
                h=h.next;
        }
return ans.next;

    }
}