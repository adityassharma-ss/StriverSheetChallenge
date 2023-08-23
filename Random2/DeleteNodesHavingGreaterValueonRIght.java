import java.util.*;

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        this.val = x;
        this.next = null;
    }
}

public class DeleteNodesHavingGreaterValueonRIght {
    public static void main(String[] args) {
        int[] nodes = {12,15,10,11,5,6,2,3};


    }

    private static ListNode compute(ListNode head){
        Node temp=head;
        while(temp.next!=null)
        {
            if(temp.data<temp.next.data)
            {
              temp.data=temp.next.data;
              temp.next=temp.next.next;
              temp=head;
              
            }
            else  temp=temp.next;
        }
        return head; 
    }
}
