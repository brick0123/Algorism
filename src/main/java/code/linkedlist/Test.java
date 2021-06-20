package code.linkedlist;

public class Test {

  public static void main(String[] args) {
    SinglyLinkedListNode node1 = new SinglyLinkedListNode(1);
    SinglyLinkedListNode node2 = new SinglyLinkedListNode(3);
    SinglyLinkedListNode node3 = new SinglyLinkedListNode(5);

    node1.next = node2;
    node2.next = node3;


    SinglyLinkedListNode node4 = new SinglyLinkedListNode(2);
    SinglyLinkedListNode node5 = new SinglyLinkedListNode(4);
    node4.next = node5;

    mergeLists(node1, node4);

  }

  static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
    if(head1 == null) {
      return head2;
    }
    if(head2 == null) {
      return head1;
    }

    SinglyLinkedListNode dummy = null;
    if (head1.data <= head2.data) {
      dummy = head1;
      head1 = head1.next;
    } else {
      dummy = head2;
      head2 = head2.next;
    }

    SinglyLinkedListNode merge = dummy;

    while (head1 != null && head2 != null) {
      if (head1.data <= head2.data) {
        dummy.next = head1;
        head1 = head1.next;
      } else {
        dummy.next = head2;
        head2 = head2.next;
      }
    }

    if (head1 != null) {
      dummy.next = head1;
    }

    if (head2 != null) {
      dummy.next = head2;
    }

    return merge;
  }

  static class SinglyLinkedListNode {

    int data;
    SinglyLinkedListNode next;

    public SinglyLinkedListNode() {
    }

    public SinglyLinkedListNode(int data) {
      this.data = data;
    }
  }



}
