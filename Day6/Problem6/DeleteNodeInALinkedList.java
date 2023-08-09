import java.util.*;

class ListNode {
    int val;
    ListNode next;
    
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class DeleteNodeInALinkedList {

    public ListNode createLinkedList(int[] values) {
        ListNode dummyHead = new ListNode();
        ListNode current = dummyHead;
        
        for (int val : values) {
            current.next = new ListNode(val);
            current = current.next;
        }
        
        return dummyHead.next;
    }

    public void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DeleteNodeInALinkedList solution = new DeleteNodeInALinkedList();
        int[] values = {1, 2, 3, 4, 5};
        ListNode head = solution.createLinkedList(values);
        solution.printLinkedList(head);
        solution.deleteNode(head.next.next);
        solution.printLinkedList(head);
    }    

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
