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
    public void reverse(ListNode left, int size){
        ListNode curr = left;
        ListNode pre = null;
        while(size>0) {
            ListNode next = curr. next;
            curr. next = pre;
            pre = curr;
            curr = next;
            size--;
        }
        return;
    }
    public ListNode swapPairs(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode left = head;
        ListNode right ;
        ListNode preleft = null;
        ListNode res = null;
        int size = 2;
        while(true){
            right = left;
            for(int j=0;j<(size-1);j++) {
                if(right==null) break;
                right = right.next;
            }
            if(right!=null) {
                ListNode nextleft = right.next;
                reverse(left, size);
                if(preleft!=null){
                    preleft. next = right;
                }
                preleft = left;
                if(res == null){
                    res = right;
                }
                left = nextleft;
            }
            else{
                if (preleft!=null) {
                    preleft.next= left;
                }
                if(res==null) {
                    res = left;
                }
                break;
            }
        }
        return res;
    }
}