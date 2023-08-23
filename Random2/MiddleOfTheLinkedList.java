import java.util.*;

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
        next = null;
    }
}

public class MiddleOfTheLinkedList{
    public static void main(String[] args) {
        int[] node = {1,2,3,4,5};
        ListNode head = new ListNode(node[0]);
        ListNode current = head;
        for(int i = 1; i < node.length; i++){
            current.next = new ListNode(node[i]);
            current = current.next;
        }
        ListNode result = MiddleOfTheLinkedList(head);
        System.out.println(result.val);
    }

    public static ListNode MiddleOfTheLinkedList(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}