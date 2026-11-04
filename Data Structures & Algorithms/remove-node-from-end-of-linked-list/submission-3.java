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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //run the loop till it reaches n+1 position
        //start a pointer from head-1, and run it till n-1
        //connect n-1 pointer with n+1
        ListNode start = new ListNode(0, head);
        ListNode fast = head;
        ListNode slow = start;
        while(n > 0){
            fast = fast.next;
            n--;
        }
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return start.next;
    }
}
