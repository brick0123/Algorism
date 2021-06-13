import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import org.junit.jupiter.api.Test;


public class PriorityQueueTest {

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
}
