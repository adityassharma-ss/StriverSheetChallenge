import java.util.*;

public class SortALinkedListOf0s1s2s {
    public static void main(String[] args) {
        int[] node = {1,2,0,2,1,0};
        ListNode head = new ListNode(node[0]);
        ListNode current = head;
        for(int i = 1; i < node.length; i++){
            current.next = new ListNode(node[i]);
            current = current.next;
        }
        ListNode result = sortALinkedListOf0s1s2s(head);
        while(result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }

    private static ListNode sortALinkedListOf0s1s2s(ListNode head){
        ListNode zero = new ListNode(0);
        ListNode one = new ListNode(0);
        ListNode two = new ListNode(0);
        ListNode zeroHead = zero;
        ListNode oneHead = one;
        ListNode twoHead = two;
        ListNode current = head;
        while(current != null){
            if(current.val == 0){
                zero.next = current;
                zero = zero.next;
            }else if(current.val == 1){
                one.next = current;
                one = one.next;
            }else{
                two.next = current;
                two = two.next;
            }
            current = current.next;
        }
        zero.next = oneHead.next != null ? oneHead.next : twoHead.next;
        one.next = twoHead.next;
        two.next = null;
        return zeroHead.next;
    }
}
