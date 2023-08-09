import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class LinkedListCycle2 {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        
        ListNode tortoise = head;
        ListNode hare = head;
        boolean hasCycle = false;
        
        while (hare != null && hare.next != null) {
            tortoise = tortoise.next;
            hare = hare.next.next;
            
            if (tortoise == hare) {
                hasCycle = true;
                break;
            }
        }
        
        if (!hasCycle) {
            return null;
        }
        
        tortoise = head;
        
        while (tortoise != hare) {
            tortoise = tortoise.next;
            hare = hare.next;
        }
        
        return hare;
    }
    
    public static void main(String[] args) {
        LinkedListCycle2 solution = new LinkedListCycle2();
        
        // Create a linked list with a cycle
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next;  // Creating a cycle
        
        ListNode cycleStart = solution.detectCycle(head);
        if (cycleStart != null) {
            System.out.println("Cycle begins at node with value: " + cycleStart.val);
        } else {
            System.out.println("No cycle in the linked list.");
        }
    }
}

