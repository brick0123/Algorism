package code.linkedlist;

import java.util.HashMap;
import java.util.Map;

public class LpuCache {

  Map<Integer, Node> map = new HashMap<>();
  Node first;
  Node tail;
  int capacity;

  public LpuCache(int capacity) {
    this.capacity = capacity;

    first = new Node();
    tail = new Node();

    first.prev = tail;
    tail.next = first;
  }

  public int get(int key) {
    Node find = map.get(key);

    if (find == null) {
      return -1;
    } else {
      remove(find);
      add(find);
    }

    return find.val;
  }

  public void put(int key, int value) {
    Node input = new Node(key, value);
    if (map.get(key) != null) {
      remove(input);
    }
    add(input);
    map.put(key, input);

    if (map.size() > capacity) {
      Node delete = tail.next;
      map.remove(delete.key);
      remove(delete);
    }
  }

  public void remove(Node head) {
    Node prev = head.prev;
    prev.next = head.next;
    prev.next.prev = prev;
  }

  public void add(Node head) {
    Node prev = first.prev;

    head.prev = prev;
    prev.next = head;

    head.next = first;
    first.prev = head;
  }

  static class Node {
    int key;
    int val;
    Node prev;
    Node next;

    public Node(int key, int val) {
      this.key = key;
      this.val = val;
    }

    public Node(){}
  }

}

class Execute {

  public static void main(String[] args) {
    LpuCache lpuCache = new LpuCache(2);

    lpuCache.put(2, 1);
    lpuCache.put(2, 2);
    lpuCache.get(2);
    lpuCache.put(1, 1);
    lpuCache.put(4, 1);
    lpuCache.get(2);
  }
}
