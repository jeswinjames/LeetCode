package LeetCode.linked_list;

public class LC206 {
    private ListNode head = null;
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return  null;
        }
        this.head = head;
        reverse(head);
        return this.head;
    }

    private ListNode reverse(ListNode listNode){
        if(listNode.next == null){
            head = listNode;
            return listNode;
        }
        reverse(listNode.next).next = listNode;
        return listNode;
    }
}
