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
    public void reorderList(ListNode head) {
        if(head.next == null || head==null) {
            return;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode curr = slow.next;
        slow.next = null;
        ListNode pre = null;
        while(curr!=null){
            ListNode nex = curr.next;
            curr.next = pre;
            pre = curr;
            curr = nex;
        }
        ListNode first = head;
        while(pre!=null){
            ListNode t1 = first.next;
            ListNode t2 = pre.next;
            first.next = pre ;
            pre.next = t1;
            first = t1;
            pre = t2;
        }
    }
}