package code.linkedlist;

public class PalindromeLinkedList {

  public static void main(String[] args) {
  }

  public boolean isPalindrome(ListNode head) {
    ListNode fast = head;
    ListNode slow = head;

    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;
    }

    slow = reverse(slow);
    fast = head;

    while (slow != null) {
      if (slow.val != fast.val) {
        return false;
      }
      slow = slow.next;
      fast = fast.next;
    }

    return true;
  }

  public ListNode reverse(ListNode head) {
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
