package leetcode;

import linkedsort.ListNode;

public class LeetCode24Done {

        public  ListNode swapPair(ListNode head){
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        ListNode begin = dummyNode;
        while(begin.next != null && begin.next.next != null){
            ListNode node1 = begin.next;
            ListNode node2 = begin.next.next;

            ListNode newBeginNode = node2.next;
            node2.next = node1;
            node1.next = newBeginNode;
            begin.next = node2;

            begin = node1;

        }

        return dummyNode.next;
    }
}
