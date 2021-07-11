import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import org.junit.jupiter.api.Test;


public class PriorityQueueTest {

  @Test
  void map() {
    Map<Integer, Integer> map = new HashMap<>();
    map.put(1, 3);
    map.put(2, 2);
    map.put(3, 1);

    Queue<Integer> heap = new PriorityQueue<>(
        (e1, e2) -> map.get(e1) - map.get(e2));
    heap.addAll(map.keySet());

    while (!heap.isEmpty()) {
      System .out.println(heap.poll());
    }
  }

  @Test
  void row_value() {
    PriorityQueue<Integer> queue = new PriorityQueue<>();
    queue.add(1);
    queue.add(2);
    queue.add(3);
    queue.add(4);

    assertThat(queue.remove()).isEqualTo(1);
    assertThat(queue.remove()).isEqualTo(2);
    assertThat(queue.remove()).isEqualTo(3);
    assertThat(queue.remove()).isEqualTo(4);
  }

  @Test
  void high_value() {
    PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
    queue.add(1);
    queue.add(2);
    queue.add(3);
    queue.add(4);

    assertThat(queue.remove()).isEqualTo(4);
    assertThat(queue.remove()).isEqualTo(3);
    assertThat(queue.remove()).isEqualTo(2);
    assertThat(queue.remove()).isEqualTo(1);
  }

  @Test
  void row_value_array() {
    PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));

    int[][] arr = {
        {5, 3},
        {2, 4},
        {7, 2},
        {1, 3},
        {3, 2}};

    queue.addAll(Arrays.asList(arr));

    System.out.println(Arrays.toString(queue.remove()));
    System.out.println(Arrays.toString(queue.remove()));
    System.out.println(Arrays.toString(queue.remove()));
    System.out.println(Arrays.toString(queue.remove()));
    System.out.println(Arrays.toString(queue.remove()));

  }

  @Test
  void t3() {

    for (int i = 0; i < 1000; i++) {
      System.out.println(i & 10);
    }
  }

  @Test
  void add() {
    String s1 = "aa";
    String s2 = "aa";

    System.out.println(s1.hashCode());
    System.out.println(s2.hashCode());
  }

  @Test
  void hash() {
    Human human1 = new Human(10);
    Human human2 = new Human(20);
    Human human3 = new Human(30);

    System.out.println(human1.hashCode());
    System.out.println(human2.hashCode());

    System.out.println(human1.equals(human2));

    Map<Human, Integer> map = new HashMap<>();

    map.put(human1, 3);
    map.put(human2, 2);
    map.put(human3, 2);

    human2.age = 50;
    System.out.println(human2.hashCode());

    System.out.println("h1="+map.get(human1));
    System.out.println("h2="+map.get(human2));

    String b = "baa".replace("b", "");
    System.out.println("b = " + b);
  }

  static class Human {
     int age;

    public Human(int age) {
      this.age = age;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (!(o instanceof Human)) {
        return false;
      }
      Human human = (Human) o;
      return age == human.age;
    }

    @Override
    public int hashCode() {
      return 1;
    }
  }

}
