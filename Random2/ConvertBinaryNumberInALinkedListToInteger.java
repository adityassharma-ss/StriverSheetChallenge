import java.util.*;

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        this.val = x;
        this.next = null;
    }
}

public class ConvertBinaryNumberInALinkedListToInteger {
    public static void main(String[] args) {
        int[] node = {1,0,1};
        ListNode head = new ListNode(node[0]);
        ListNode current = head;
        for(int i = 1; i < node.length; i++){
            current.next = new ListNode(node[i]);
            current = current.next;
        }
        int result = getDecimalValue(head);
        System.out.println(result);
    }

    private static int getDecimalValue(ListNode head){
        int result = 0;
        while(head != null){
            result = result * 2 + head.val;
            head = head.next;
        }
        return result;
    }
}
