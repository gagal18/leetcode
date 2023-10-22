package linked_list.e876;

/**
 * Definition for singly-linked list.
 **/
 class ListNode {
 int val;
 ListNode next;
 ListNode() {}
 ListNode(int val) { this.val = val; }
 ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode curr = head;
        int length = 0;
        while(curr != null){
            length++;
            curr = curr.next;
        }
        System.out.println(length/2);
        return null;
    }
}