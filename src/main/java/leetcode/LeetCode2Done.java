package leetcode;

import linkedsort.ListNode;

/**
 * 链表2数相加，计算每一位的时候需要注意前一位进位，所以sum是之前进位+val1+val2 进位值是sum/10
 * 最后做完的时候也要注意最高位进位
 */
public class LeetCode2Done {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode currentNode = dummyHead;

        int step = 0;
        while (p1 != null || p2 != null) {
            int val1 = p1 != null ? p1.val : 0;
            int val2 = p2 != null ? p2.val : 0;
            int sum = step + val1 + val2;
            step = sum/10;
            ListNode temp = new ListNode(sum % 10);
            currentNode.next = temp;
            currentNode = currentNode.next;

            if(p1 != null){
                p1 = p1.next;
            }
            if(p2 != null){
                p2 = p2.next;
            }

        }

        if(step > 0){
            currentNode.next = new ListNode(step);
        }

        return dummyHead.next;


    }
}
