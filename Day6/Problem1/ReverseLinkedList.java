import java.util.*;

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
    }
}

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode temp = head;
        for(int i=2; i<=5; i++){
            temp.next = new ListNode(i);
            temp = temp.next;
        }
        ListNode ans = reverseList(head);
        ListNode ans2 = reverseList2(head);
        while(ans != null){
            System.out.print(ans.val + " ");
            ans = ans.next;
        }
    }

    public static ListNode reverseList(ListNode head){
        if(head == null || head.next == null){
            return head;
        }

        ListNode prev = null, curr = head, next = null; 
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public ListNode reverseList2(ListNode head) {
        if(head == null || head.next == null)
        return head;
    
        ListNode p = reverseList(head.next);

        head.next.next = head;
        head.next = null;
        return p;
    }
}
