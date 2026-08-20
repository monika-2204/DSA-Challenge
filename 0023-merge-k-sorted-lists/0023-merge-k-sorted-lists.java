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
       PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)-> a.val-b.val);
       for(int i =0;i<lists.length;i++){
        if(lists[i]!=null){
            pq.add(lists[i]);
        }
       }
       ListNode result = new ListNode(-1);
       ListNode curr = result;
       while(!pq.isEmpty()){
        ListNode node = pq.poll();
        curr.next = node;
        curr = curr.next;
        if(node.next!=null){
            pq.add(node.next);
        }
       }
       return result.next;
    }
}