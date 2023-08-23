import java.util.LinkedList;
import java.util.List;

public class ReverseLinkedList2 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right) return head;
        List<Integer> list = new LinkedList<>();
        recursion(head, list, left, right, 0);
        return head;
    }

    private void recursion(ListNode node, List<Integer> list, int left, int right, int current){
        if(node == null) return;
        current++;
        if(current >= left && current <= right){
            list.add(node.val);
        }
        if(current > right){
            return;
        }

        recursion(node.next, list, left, right, current);
        if(current >= left && current <=right){
            node.val = list.get(0);
            list.remove(0);
        }
    }
}
