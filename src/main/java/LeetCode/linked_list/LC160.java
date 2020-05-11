package LeetCode.linked_list;

public class LC160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        ListNode copyA = headA;
        ListNode copyB = headB;

        boolean changedA = false;
        boolean changedB = false;

        while(copyA != null && copyB != null){
            if(copyA == copyB){
                return copyA;
            }
            if(copyA.next == null && !changedA){
                copyA = headB;
                changedA = true;
            }else if(copyB.next == null && !changedB){
                copyB = headA;
                changedB = true;
            }else {
                copyA = copyA.next;
                copyB = copyB.next;
            }
        }
        return null;
    }
}
