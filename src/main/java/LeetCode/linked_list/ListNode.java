package LeetCode.linked_list;

public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int x) {
        val = x;
    }

    public static ListNode arrayToList(int[] array){
        if(array.length == 0){
            return null;
        }
        ListNode head = new ListNode(array[0]);
        ListNode current = head;
        for(int i =1; i < array.length; i++){
            ListNode newNode = new ListNode(array[i]);
            current.next = newNode;
            current = newNode;
        }
        return head;
    }
}