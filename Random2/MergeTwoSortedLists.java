import java.util.*;

public class MergeTwoSortedLists {
    private static ListNode mergeTwoLists(Listnode list1, ListNode list2){
        if(list1 ==  null || list2 == null){
            return list1 == null ? list2 : list1;
        }

        if(list1.val > list2.val){
            ListNode temp = list1;
            list1 = list2;
            list2 = temp;
        }
        list1.next = mergeTwoLists(list1.next, list2);
        return list1;
    }
}