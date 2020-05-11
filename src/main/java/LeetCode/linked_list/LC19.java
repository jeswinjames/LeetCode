package LeetCode.linked_list;

public class LC19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode copy = head;
        ListNode slowPointer = null;
        int count = 0;
        while (head.next != null){
            if(count < n){
                count++;
                if(count ==n){
                    slowPointer = copy;
                }
            }else {
                slowPointer = slowPointer.next;
            }
            head = head.next;
        }
        if(slowPointer == null){
            return copy.next;
        }
        slowPointer.next = slowPointer.next.next;
        return copy;
    }
}
