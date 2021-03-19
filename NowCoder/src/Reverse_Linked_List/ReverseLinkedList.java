package Reverse_Linked_List;

/**
 * @author : KAOS
 * @date : 2021/3/18 20:13
 **/
public class ReverseLinkedList {
    public class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }
    }

    public class Solution {
        public ListNode ReverseList(ListNode head) {
            if (head==null){
                return null;
            }
            ListNode tail = head.next;
            head.next = null;
            ListNode temp;
            while (tail!=null){
                temp = tail.next;
                tail.next = head;
                head = tail;
                tail = temp;
            }
            return head;
        }
    }
}
