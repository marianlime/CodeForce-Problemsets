class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode previous = null;
        ListNode curr = head;

        while(curr != null){
            ListNode next = curr.next;
            curr.next = previous;
            previous = curr;
            curr = next;

        }
        return previous;
    }
}
