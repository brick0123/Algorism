package code.linkedlist;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/linked-list/560/
 */
public class ReverseLinkedList {

  public ListNode reverseList(ListNode head) {
    ListNode prev = null;

    while (head != null) {
      ListNode nextNode = head.next;
      head.next = prev;
      prev = head;
      head = nextNode;
    }
    return prev;
  }

}
