package leetcode;

import linkedsort.ListNode;

/**
 * 翻转链表 注意点，就是每个链表的指针重新指向的时候，需要注意会丢失原因值的位置，需要优先记录一下#willLoseLinkNode
 */
public class LeetCode206Done {

    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode current = head;
        while(current != null){
            ListNode willLoseLinkNode = current.next;
            current.next = pre;
            pre = current;
            current = willLoseLinkNode;
        }
        return pre;
    }
}
