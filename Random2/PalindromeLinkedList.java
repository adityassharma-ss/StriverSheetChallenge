public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
        return true;
    }

    ListNode r_head = null;
    ListNode ptr = head;
    while(ptr!=null){
        ListNode temp = new ListNode(ptr.val);
        temp.next = r_head;
        r_head = temp;
        ptr = ptr.next;
    }

    while(head != null && r_head != null){
        if(head.val != r_head.val){
            return false;
        }
        head = head.next;
        r_head = r_head.next;
    }
    return true;
}
}
