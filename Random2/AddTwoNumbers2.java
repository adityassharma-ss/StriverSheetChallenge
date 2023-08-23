class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
    }
}

public class AddTwoNumbers2 {
    public static void main(String[] args) {
        int[] node1 = {7,2,4,3};
        int[] node2 = {5,6,4};
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
        ListNode result = addTwoNumbers2(head1, head2);
        while(result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }

    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head1 = rev(l1);
        ListNode head2 = rev(l2);
        int carry = 0;
        ListNode head = null;
        ListNode temp = null;
        while (head1 != null || head2 != null || carry != 0) {
            int sum = carry;
            if (head1 != null) {
                sum += head1.val;
                head1 = head1.next;
            }
            if (head2 != null) {
                sum += head2.val;
                head2 = head2.next;
            }
            carry = sum / 10;
            sum = sum % 10;
            ListNode newNode = new ListNode(sum);
            if (head == null) {
                head = newNode;
                temp = head;
            }
            else {
                temp.next = newNode;
                temp = temp.next;
            }
        }
        return rev(head); 
    }

    public ListNode rev(ListNode head){
       ListNode prev = null;
        ListNode current = head;

        while(current != null){
            ListNode forward = current.next;
            current.next = prev;
            prev = current;
            current = forward;
        }
        return prev;

    }
}
}
