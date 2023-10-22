package linked_list.e1290;

// Definition for singly-linked list.
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
class Solution {
    public int getDecimalValue(ListNode head) {
        ListNode curr = head;
        int decVal = 0;
        int depth = -1;
        while(curr != null){
            depth++;
            curr = curr.next;
        }
        curr = head;
        while(curr != null){
            decVal += (curr.val==1) ? Math.pow(2,depth) : 0;
            curr = curr.next;
            depth--;
        }
        return decVal;
    }
}