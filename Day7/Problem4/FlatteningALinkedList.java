package Day7.Problem4;
import java.util.*;

class ListNode{
    int val;
    ListNode next;
    ListNode bottom;
    ListNode(){}
        ListNode(int val){
            this.val = val;
        }
        ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
}

public class FlatteningALinkedList {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode temp = l1;
        for(int i=2; i<=5; i++){
            temp.next = new ListNode(i);
            temp = temp.next;
        }
        ListNode ans = flatten(l1);
        while(ans != null){
            System.out.print(ans.val + " ");
            ans = ans.next;
        }
    }

    public static ListNode flatten(ListNode l1){
        if(l1 == null || l1.next == null){
            return l1;
        }
        l1.next = flatten(l1.next);
        l1 = merge(l1,l1.next);
        return l1;
    }

    private static ListNode merge(ListNode l1, ListNode l2){
        if(l1 == null) return l2;
        if(l2 == null) return l1;

        ListNode result;

        if(l1.val < l2.val){
            result = l1;
            result.bottom = merge(l1.bottom, l2);
        }
        else{
            result = l2;
            result.bottom = merge(l1, l2.bottom);
        }
        result.next = null;
        return result;
    }
}