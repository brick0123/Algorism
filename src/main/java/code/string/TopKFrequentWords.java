package code.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class TopKFrequentWords {

    public List<String> topKFrequent(String[] words, int k) {
        Arrays.sort(words);

        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.merge(word, 1, Integer::sum);
        }

        Queue<String> heap = new PriorityQueue<>(
            (o1, o2) -> {
                if (map.get(o1) == map.get(o2)) {
                    return o1.compareTo(o2);
                } else {
                    return map.get(o2) - map.get(o1);
                }
            }
        );

        for (String s: map.keySet()) {
            heap.offer(s);
        }

        List<String> result = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            result.add(heap.poll());
        }
        return result;

    }

}
