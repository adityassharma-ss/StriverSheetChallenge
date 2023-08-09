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

public class SearchInLinkedList {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode temp = l1;
        for(int i=2; i<=5; i++){
            temp.next = new ListNode(i);
            temp = temp.next;
        }
        ListNode ans = search(l1, 3);
        System.out.println(ans.val);
    }

    public static ListNode search(ListNode l1, int k){
        if(l1 == null){
            return null;
        }
        ListNode temp = l1;
        while(temp != null){
            if(temp.val == k){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
}
