import java.util.*;

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        this.val = x;
        this.next = null;
    }
}

public class RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {
        int[] node = {1,1,2};
        ListNode head = new ListNode(node[0]);
        ListNode current = head;
        for(int i = 1; i < node.length; i++){
            current.next = new ListNode(node[i]);
            current = current.next;
        }
        ListNode result = removeDuplicatesFromSortedList(head);
        while(result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }

    private static ListNode removeDuplicatesFromSortedList(ListNode head){
        ListNode current = head;
        while(current != null && current.next != null){
            if(current.val == current.next.val){
                current.next = current.next.next;
            }else{
                current = current.next;
            }
        }
        return head;
    }
}

