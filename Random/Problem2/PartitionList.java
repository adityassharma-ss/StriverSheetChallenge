import java.util.*;

class ListNode{
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class PartitionList {
    public static void main(String[] args) {
        int[] Node = {1,4,3,2,5,2};
        ListNode head = new ListNode(Node[0]);
        ListNode p = head;
        for(int i=1; i<Node.length; i++) {
            p.next = new ListNode(Node[i]);
            p = p.next;
        }
        int x = 3;
        ListNode result = partition(head, x);
        while(result != null){
            System.out.print(result.val + " ");
            result = result.next;
        }
    }

    public static ListNode partition(ListNode head, int x) {
        ListNode lessthanXdummy = new ListNode(0);
        ListNode greaterthanXdummy = new ListNode(0);

        ListNode lessthanX = lessthanXdummy;
        ListNode greaterthanX = greaterthanXdummy;

        while(head != null){
            if(head.val < x){
                lessthanX.next = head;
                lessthanX = lessthanX.next;
            }
            else{
                greaterthanX.next = head;
                greaterthanX = greaterthanX.next;
            }
            head = head.next;
        }

        greaterthanX.next = null;
        lessthanX.next = greaterthanXdummy.next;

        return lessthanXdummy.next;
    }
}
