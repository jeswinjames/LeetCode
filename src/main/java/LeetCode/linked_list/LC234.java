package LeetCode.linked_list;

public class LC234 {
    public static boolean isPalindrome(ListNode head) {
        ListNode reverseHead = null;
        ListNode copy = head;
        while(head != null){
            ListNode newNode = new ListNode(head.val);
            newNode.next = reverseHead;
            reverseHead = newNode;
            head = head.next;
        }
        while(copy != null){
            if(copy.val != reverseHead.val){
                return false;
            }
            copy = copy.next;
            reverseHead = reverseHead.next;
        }
        return true;
    }
}
