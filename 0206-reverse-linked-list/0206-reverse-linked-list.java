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
    public ListNode reverseList(ListNode head) {
//         recursion
        ListNode curr = head;
        ListNode prev = null;
        ListNode next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
        
        
        
//         ListNode prev = null;
//         ListNode current = head;

//         while (current != null) {
//             ListNode nextNode = current.next;
//             current.next = prev;
//             prev = current;
//             current = nextNode;
//         }

//         return prev;
    }
}