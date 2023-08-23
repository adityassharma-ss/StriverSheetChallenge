import java.util.*;

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        this.val = x;
        this.next = null;
    }
}

public class RemoveLinkedListElements {
    public static void main(String[] args) {
        int[] node = {1,2,6,3,4,5,6};
        int val = 6;
        ListNode head = new ListNode(node[0]);
        ListNode current = head;
        for(int i = 1; i < node.length; i++){
            current.next = new ListNode(node[i]);
            current = current.next;
        }
        ListNode result = removeLinkedListElements(head, 6);
        while(result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }

    private static ListNode removeLinkedListElements(ListNode head, int val){

        ListNode current = head;
        while(current != null && current.next != null){
            if(current.next.val == val){
                current.next = current.next.next;
            }
            else{
                current = current.next;
            }
        }
        return head;
    }
}
