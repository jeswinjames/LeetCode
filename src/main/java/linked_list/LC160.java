package linked_list;

public class LC160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        ListNode copyA = headA;
        ListNode copyB = headB;
        ListNode longer;
        ListNode shorter;
        ListNode diffNode;

        while (copyA != null && copyB != null){
            if(copyA == copyB){
                return copyA;
            }
            copyA = copyA.next;
            copyB = copyB.next;
        }

        if(copyA == null && copyB == null){
            return null;
        }

        if(copyA == null){
            longer = headB;
            shorter = headA;
            diffNode = copyB;
        }else {
            longer = headA;
            shorter = headB;
            diffNode = copyA;
        }

        int diff = 0;
        while(diffNode != null){
            diff++;
            diffNode = diffNode.next;
        }

        while(diff > 0){
            longer = longer.next;
            diff--;
        }

        while(longer != shorter){
            longer = longer.next;
            shorter = shorter.next;
        }
        return longer;
    }
}
