import java.util.*;

class ListNode{
    int val;
    ListNode next;
    ListNode(){}
        ListNode(int val){
            this.val = val;
        }
        ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
}

public class ReverseNodesInKGroup {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode temp = l1;
        for(int i=2; i<=5; i++){
            temp.next = new ListNode(i);
            temp = temp.next;
        }
        ListNode ans = reverseKGroup(l1, 2);
        while(ans != null){
            System.out.print(ans.val + " ");
            ans = ans.next;
        }
    }

    public static ListNode reverseKGroup(ListNode l1, int k){
        if(l1 == null || l1.next == null){
            return l1;
        }
        ListNode prev = null, curr = l1, next = null;
        int count = 0;
        while(curr != null && count < k){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        if(next != null){
            l1.next = reverseKGroup(next, k);
        }
        return prev;
    } 
}
