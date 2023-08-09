import java.util.*;

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
    }
}

public class RemoveNthNodeFromTheEndOfList{
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode temp = l1;
        for(int i=2; i<=5; i++){
            temp.next = new ListNode(i);
            temp = temp.next;
        }
        ListNode ans = removeNthFromEnd(l1, 2);
        while(ans != null){
            System.out.print(ans.val + " ");
            ans = ans.next;
        }
    }

    public static ListNode removeNthFromEnd(ListNode l1, int n){
        if(l1 ==  null || l1.next == null){
            return null;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = l1;
        ListNode fast = dummy;
        ListNode slow =  dummy;
        for(int i=0; i<n; i++){
            fast = fast.next;
        }
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        if(slow.next != null){
            slow.next = slow.next.next;
        }
        return dummy.next;
    }
}