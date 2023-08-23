import java.util.*;

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        this.val = x;
        this.next = null;
    }
}

public class MultiplyTwoNumbersRepresentedByLinkedList {
    public static void main(String[] args) {
        int[] node1 = {1,2,3};
        int[] node2 = {1,2,3};
        ListNode head1 = new ListNode(node1[0]);
        ListNode current1 = head1;
        for(int i = 1; i < node1.length; i++){
            current1.next = new ListNode(node1[i]);
            current1 = current1.next;
        }
        ListNode head2 = new ListNode(node2[0]);
        ListNode current2 = head2;
        for(int i = 1; i < node2.length; i++){
            current2.next = new ListNode(node2[i]);
            current2 = current2.next;
        }
        long result = multiplyTwoLists(head1, head2);
        System.out.println(result);
    }

    private static long multiplyTwoLists(ListNode first, ListNode second){
        long N = 1000000007;
        long num1 = 0, num2 = 0;
        while (first != null || second !=  null){
              
            if(first != null){
                num1 = ((num1)*10)%N + first.val;
                first = first.next;
            }
              
            if(second != null)
            {
                num2 = ((num2)*10)%N + second.val;
                second = second.next;
            }
              
        }
        return ((num1%N)*(num2%N))%N;
    }
}
