package linked_list;

public class LC21 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode resultHead = null;
        ListNode resultTail = null;

        while(l1 != null || l2 != null){
            ListNode res ;
            if(l1 != null &&(l2 == null || l1.val < l2.val)){
                res = l1;
                l1 = l1.next;
            }else {
                res = l2;
                l2 = l2.next;
            }
            if(resultHead == null){
                resultHead = res;
                resultTail = res;
            }else {
                resultTail.next = res;
                resultTail = res;
            }
        }
        return resultHead;
    }
}
