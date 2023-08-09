import java.util.*;

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
    }
}

public class MiddleOfTheLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode temp = head;
        for(int i=2; i<=5; i++){
            temp.next = new ListNode(i);
            temp = temp.next;
        }
        ListNode ans = middleNode(head);
        System.out.print(ans.val + " ");
    }

    public static ListNode middleNode(ListNode head){
        if(head == null || head.next == null){
            return head;
        }

        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next;
            if(fast != null){
                fast = fast.next;
            }
        }

        return slow;
    }
}
