package code.linkedlist;

public class NodeTest {

  public static void main(String[] args) {
    ListNode listNode = new ListNode(10);

    ListNode next = listNode.next;

    next = new ListNode(50);

    System.out.println("listNode = " + listNode.next);

    int i = next.hashCode();
  }

}
