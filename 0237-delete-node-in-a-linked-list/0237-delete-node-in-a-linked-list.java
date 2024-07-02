/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        if (node == null) {
            return;
        }
        
        // Copy the value of the next node into the current node
        node.val = node.next.val;
        // Update the next pointer to skip the next node
        node.next = node.next.next;
    }
}