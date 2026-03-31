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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode result = null;
        for(ListNode temp: lists){
            result = mergeTwoLinkedLists(result ,temp);
        }
        return result ;
    }
    public ListNode mergeTwoLinkedLists(ListNode list1,ListNode list2){
        ListNode p1= list1;
        ListNode p2= list2;
        ListNode start=null;
        ListNode end =null;
       if(p1==null){
        return p2;
       }
       if(p2==null){
        return p1;
       }
        while(p1!=null&&p2!= null){
            ListNode temp =new ListNode();
            if(start==null){
                start =temp;
                end =temp;
            }
            else {
                end.next=temp;
                end=temp;
            }
            if(p1.val<=p2.val){
                temp.val=p1.val;
                p1=p1.next;
            }
            else if (p1.val>=p2.val){
                temp.val=p2.val;
                p2=p2.next;
            }

        }
        if(p1!=null){
            end.next=p1;
        }
        if(p2!=null){
            end.next=p2;
        }
        return start;
    }
}