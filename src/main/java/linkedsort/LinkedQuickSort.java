package linkedsort;

public class LinkedQuickSort {

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

        quickSort(head,null);

        while(head != null){
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static void quickSort(ListNode head,ListNode end){
        if(head != end){
            ListNode node = partition(head,end);
            quickSort(head,node);
            quickSort(node.next,end);
        }
    }

    private static ListNode partition(ListNode head, ListNode end) {

        ListNode currentStandard = head;

        ListNode fromAdd1 = head.next;

        while(fromAdd1 != end){

            if(fromAdd1.val < head.val){
                currentStandard = currentStandard.next;

                int temp = currentStandard.val;
                currentStandard.val = fromAdd1.val;
                fromAdd1.val = temp;
            }
            fromAdd1 = fromAdd1.next;
        }

        if(currentStandard != head){
            int temp = currentStandard.val;
            currentStandard.val = head.val;
            head.val = temp;
        }

        return currentStandard;

    }
}
