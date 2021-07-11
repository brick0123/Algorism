package code.linkedlist;

public class AddTwoNumbersV2 {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(7);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(4);
        ListNode listNode4 = new ListNode(3);

        listNode.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;

        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(6);
        ListNode l3 = new ListNode(4);

        l1.next = l2;
        l2.next = l3;
        addTwoNumbers(listNode, l1);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverse(l1);
        l2 = reverse(l2);

        ListNode result = null;

        int carry = 0;
        while (l1 != null || l2 != null) {

            int num1 = l1 != null ? l1.val : 0;
            int num2 = l2 != null ? l2.val : 0;

            int sum = (num1 + num2 + carry) % 10;
            carry = (num1 + num2 + carry) / 10;

            ListNode tmp = new ListNode(sum);
            tmp.next = result;
            result = tmp;

            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }

        if (carry != 0) {
            ListNode tmp = new ListNode(carry);
            tmp.next = result;
            result = tmp;
        }

        return result;
    }

    static ListNode reverse(ListNode head) {
        ListNode prev = null;

        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

}
