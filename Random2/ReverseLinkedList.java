public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
        return head;
    
        ListNode p = reverseList(head.next);

        head.next.next = head;
        head.next = null;
        return p;
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while(current != null){
            ListNode forward = current.next;
            current.next = prev;
            prev = current;
            current = forward;
        }
        return prev;
    }
}
