import java.util.*;

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        this.val = x;
        this.next = null;
    }
}

public class LinkedListCycle {
    public static void main(String[] args) {
        int[] node = {2,3,0,-4};
        int pos = 1;
        ListNode head = new ListNode(node[0]);
        ListNode current = head;
        ListNode cycle = null;
        for(int i = 1; i < node.length; i++){
            current.next = new ListNode(node[i]);
            current = current.next;
            if(i == pos){
                cycle = current;
            }
        }
        current.next = cycle;
        boolean result = hasCycle(head);
        System.out.println(result);
    }

    private static boolean hasCycle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            if(slow == fast){
                return true;
            }
            slow =  slow.next;
            fast = fast.next.next;
        }
        return false;
    }
}
