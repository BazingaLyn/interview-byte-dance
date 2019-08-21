package linkedsort;

public class LinkedMergeSort {

    public static void main(String[] args) {
        ListNode head = new ListNode(5);
        ListNode p1 = new ListNode(9);
        ListNode p2 = new ListNode(3);
        ListNode p3 = new ListNode(7);
        ListNode p4 = new ListNode(2);
        ListNode p5 = new ListNode(8);
        ListNode p6 = new ListNode(4);
        head.next = p1;
        p1.next = p2;
        p2.next = p3;
        p3.next = p4;
        p4.next = p5;
        p5.next = p6;

        head = new LinkedMergeSort().sortList(head);

        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    public  ListNode sortList(ListNode head) {

        //采用归并排序
        if (head == null || head.next == null) {
            return head;
        }
        //获取中间结点
        ListNode mid = getMid(head);
        ListNode right = mid.next;
        mid.next = null;
        //合并
        return mergeSort(sortList(head), sortList(right));
    }

    /**
     * 获取链表的中间结点,偶数时取中间第一个
     *
     * @param head
     * @return
     */
    private  ListNode getMid(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        //快慢指针
        ListNode slow = head, quick = head;
        //快2步，慢一步
        while (quick.next != null && quick.next.next != null) {
            slow = slow.next;
            quick = quick.next.next;
        }
        return slow;
    }

    /**
     *
     * 归并两个有序的链表
     *
     * @param head1
     * @param head2
     * @return
     */
    private  ListNode mergeSort(ListNode head1, ListNode head2) {
        ListNode p1 = head1, p2 = head2, head;
        //得到头节点的指向
        if (head1.val < head2.val) {
            head = head1;
            p1 = p1.next;
        } else {
            head = head2;
            p2 = p2.next;
        }

        ListNode p = head;
        //比较链表中的值
        while (p1 != null && p2 != null) {

            if (p1.val <= p2.val) {
                p.next = p1;
                p1 = p1.next;
                p = p.next;
            } else {
                p.next = p2;
                p2 = p2.next;
                p = p.next;
            }
        }
        //第二条链表空了
        if (p1 != null) {
            p.next = p1;
        }
        //第一条链表空了
        if (p2 != null) {
            p.next = p2;
        }
        return head;
    }

//    public static ListNode sortList1(ListNode head) {
//
//        if (head == null || head.next == null) {
//            return head;
//        }
//
//        //获取中间结点
//        ListNode mid = getMid(head);
//        ListNode right = mid.next;
//        mid.next = null;
//
//        return mergeSort(sortList1(head), sortList1(right));
//    }
//
//    public static ListNode sortList(ListNode head) {
//
//        //采用归并排序
//        if (head == null || head.next == null) {
//            return head;
//        }
//        //获取中间结点
//        ListNode mid = getMid(head);
//        ListNode right = mid.next;
//        mid.next = null;
//        //合并
//        return mergeSort(sortList(head), sortList(right));
//    }
//
//    /**
//     * 获取链表的中间结点,偶数时取中间第一个
//     *
//     * @param head
//     * @return
//     */
//    private static ListNode getMid(ListNode head) {
//        if (head == null || head.next == null) {
//            return head;
//        }
//        //快慢指针
//        ListNode slow = head, quick = head;
//        //快2步，慢一步
//        while (quick.next != null && quick.next.next != null) {
//            slow = slow.next;
//            quick = quick.next.next;
//        }
//        return slow;
//    }
//
//    /**
//     *
//     * 归并两个有序的链表
//     *
//     * @param head1
//     * @param head2
//     * @return
//     */
//    private static ListNode mergeSort(ListNode head1, ListNode head2) {
//        ListNode p1 = head1, p2 = head2, head;
//        //得到头节点的指向
//        if (head1.val < head2.val) {
//            head = head1;
//            p1 = p1.next;
//        } else {
//            head = head2;
//            p2 = p2.next;
//        }
//
//        ListNode p = head;
//        //比较链表中的值
//        while (p1 != null && p2 != null) {
//
//            if (p1.val <= p2.val) {
//                p.next = p1;
//                p1 = p1.next;
//                p = p.next;
//            } else {
//                p.next = p2;
//                p2 = p2.next;
//                p = p.next;
//            }
//        }
//        //第二条链表空了
//        if (p1 != null) {
//            p.next = p1;
//        }
//        //第一条链表空了
//        if (p2 != null) {
//            p.next = p2;
//        }
//        return head;
//    }
//
//    //    private static ListNode mergeSort(ListNode head1, ListNode head2) {
////
////        ListNode p1 = head1;
////        ListNode p2 = head2;
////
////        ListNode head;
////
////
////        if(head1.val < head2.val){
////            head = head1;
////            p1 = p1.next;
////        }else{
////            head = head2;
////            p2 = p2.next;
////        }
////
////
////        ListNode p = head;
////
////        while(p1 != null && p2 != null){
////            if(p1.val <= p2.val){
////                p.next = p1;
////                p1 = p1.next;
////                p = p.next;
////            }else{
////                p.next = p2;
////                p2 = p2.next;
////                p = p.next;
////            }
////        }
////
////        if(p1 != null){
////            p.next = p1;
////        }
////
////        if(p2 != null){
////            p.next = p2;
////        }
////
////        return head;
////
////    }
//    private static ListNode mergeSort1(ListNode head1, ListNode head2) {
//        ListNode p1 = head1, p2 = head2, head;
//        //得到头节点的指向
//        if (head1.val < head2.val) {
//            head = head1;
//            p1 = p1.next;
//        } else {
//            head = head2;
//            p2 = p2.next;
//        }
//
//        ListNode p = head;
//        //比较链表中的值
//        while (p1 != null && p2 != null) {
//
//            if (p1.val <= p2.val) {
//                p.next = p1;
//                p1 = p1.next;
//                p = p.next;
//            } else {
//                p.next = p2;
//                p2 = p2.next;
//                p = p.next;
//            }
//        }
//        //第二条链表空了
//        if (p1 != null) {
//            p.next = p1;
//        }
//        //第一条链表空了
//        if (p2 != null) {
//            p.next = p2;
//        }
//        return head;
//    }
//
//    private ListNode getMid1(ListNode head) {
//        if (head == null || head.next == null) {
//            return head;
//        }
//        //快慢指针
//        ListNode slow = head, quick = head;
//        //快2步，慢一步
//        while (quick.next != null && quick.next.next != null) {
//            slow = slow.next;
//            quick = quick.next.next;
//        }
//        return slow;
//    }
//
////    private static ListNode getMid(ListNode head) {
////        if (head == null || head.next == null) {
////            return head;
////        }
////        //快慢指针
////        ListNode slow = head, quick = head;
////        //快2步，慢一步
////        while (quick.next != null && quick.next.next != null) {
////            slow = slow.next;
////            quick = quick.next.next;
////        }
////        return slow;
////    }
}
