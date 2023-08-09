import java.util.*;

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
    }
}

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode temp = l1;
        for(int i=2; i<=5; i++){
            temp.next = new ListNode(i);
            temp = temp.next;
        }
        ListNode l2 = new ListNode(1);
        temp = l2;
        for(int i=3; i<=6; i++){
            temp.next = new ListNode(i);
            temp = temp.next;
        }
        ListNode ans = mergeTwoLists(l1, l2);
        while(ans != null){
            System.out.print(ans.val + " ");
            ans = ans.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2){
        if(l1 == null && l2 == null){
            return null;
        }
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        if (l1.val > l2.val) {
            ListNode temp = l1;
            l1 = l2;
            l2 = temp;
          }
          l1.next = mergeTwoLists(l1.next, l2);
          return l1;
    }
}
