class ListNode {
    int val;
    ListNode next;
    
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode();
        ListNode current = dummyHead;
        int carry = 0;
        
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
        }
        
        return dummyHead.next;
    }
    
    // Helper function to create a linked list from an array of values
    public ListNode createLinkedList(int[] values) {
        ListNode dummyHead = new ListNode();
        ListNode current = dummyHead;
        
        for (int val : values) {
            current.next = new ListNode(val);
            current = current.next;
        }
        
        return dummyHead.next;
    }
    
    // Helper function to print a linked list
    public void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    
    public static void main(String[] args) {
        AddTwoNumbers solution = new AddTwoNumbers();
        
        // Example input
        int[] values1 = {2, 4, 3};
        int[] values2 = {5, 6, 4};
        
        ListNode l1 = solution.createLinkedList(values1);
        ListNode l2 = solution.createLinkedList(values2);
        
        // Calculate the sum of two numbers represented as linked lists
        ListNode result = solution.addTwoNumbers(l1, l2);
        
        // Print the result as a linked list
        solution.printLinkedList(result);
    }
}
