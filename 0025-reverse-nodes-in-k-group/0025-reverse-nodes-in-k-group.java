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
    public void reverse(ListNode left, int size) {
        ListNode curr = left;
        ListNode pre = null;
        while(size>0){
            ListNode nex = curr. next;
            curr. next = pre;
            pre = curr;
            curr = nex;
            size--;
        }
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null) return head;
        ListNode res = null;
        ListNode preleft = null;
        ListNode left = head;
        ListNode right;
        while(true) {
            right = left;
            for(int j=0;j<k-1;j++) {
                if(right==null) break;
                right = right.next;
            }
            if(right != null){
                ListNode left2 = right. next;
                reverse(left,k);
                if(preleft!=null){
                    preleft. next = right;
                }
                preleft = left;
                if(res==null) res = right;
                left = left2;
            }else{
                if(preleft!=null)
                    preleft. next = left;
                if(res==null) res = left;
                break;
            }
        }
        return res;
    }
}