import java.util.*;

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
    }
}

public class LinkedListCycle {
    public static void main(String[] args) {
        ListNode head = generateLinkedList(1, 5);
        ListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = head.next;
        System.out.println(hasCycle(head)); 
    }

    private static boolean hasCycle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    public static ListNode generateLinkedList(int start, int end) {
        ListNode head = new ListNode(start);
        ListNode temp = head;
        for (int i = start + 1; i <= end; i++) {
            temp.next = new ListNode(i);
            temp = temp.next;
        }
        return head;
    }

    public static void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}
