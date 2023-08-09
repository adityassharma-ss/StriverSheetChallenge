import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class RotateList {
    public static void main(String[] args) {
        RotateList solution = new RotateList();
        
        // Create a linked list
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next = new ListNode(4);
        head.next.next = new ListNode(5);
        
        ListNode rotatedList = solution.rotateRight(head, 2);
        while (rotatedList != null) {
            System.out.print(rotatedList.val + " ");
            rotatedList = rotatedList.next;
        }
    }

    public static ListNode rotateRight(ListNode head, int k){
        if(head == null || head.next == null || k == 0){
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        int i;
        for(i=0; fast.next != null; i++){
            fast = fast.next;
        }
        for(int j = i-k%i; j>0; j--){
            slow = slow.next;
        }
        fast.next = dummmy.next;
        dummy.next = slow.next;
        slow.next = null;
        return dummy.next;
    }
}
