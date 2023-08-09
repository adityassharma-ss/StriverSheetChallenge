import java.util.*;

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
    }
}

public class IntersectionOfTwoLinkedLists {
    public static void main(String[] args) {
        ListNode l1 = generateLinkedList(1, 5);
        ListNode l2 = generateLinkedList(1, 6);

        ListNode ans = getIntersectionNode(l1, l2);

        printLinkedList(ans);
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

    public static ListNode getIntersectionNode(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            return null;
        }

        ListNode slow = l1;
        ListNode fast = l2;

        while (slow != fast) {
            if (slow == null) {
                slow = l2;
            } else {
                slow = slow.next;
            }

            if (fast == null) {
                fast = l1;
            } else {
                fast = fast.next;
            }
        }
        return slow;
    }
}

