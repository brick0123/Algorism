package code;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class TopKElements {

  public static void main(String[] args) {

    topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2);

  }

  public static int[] topKFrequent(int[] nums, int k) {
    int[] result = new int[k];

    Map<Integer, Integer> map = new HashMap<>();
    for (int num : nums) {
      map.merge(num, 1, Integer::sum);
    }
    Queue<Integer> heap = new PriorityQueue<>(
        (e1, e2) -> map.get(e2) - map.get(e1));

    for (int num : map.keySet()) {
      heap.add(num);
    }

    for (int i = k-1; i >= 0; i--) {
      result[i] = heap.poll();
    }

    return result;

  }

}
