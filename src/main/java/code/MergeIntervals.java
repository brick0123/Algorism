package code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {

  public static int[][] merge(int[][] intervals) {
    Arrays.sort(intervals, (o1, o2) -> Integer.compare(o1[0], o2[0]));

    List<int[]> result = new ArrayList<>();
    int[] current = intervals[0];
    result.add(current);

    for (int[] interval : intervals) {
      int currentStart = current[0];
      int currentEnd = current[1];

      int nextStart = interval[0];
      int nextEnd = interval[1];

      if (currentEnd >= nextStart) {
        current[1] = Math.max(currentEnd, nextEnd);
      } else {
        current = interval;
        result.add(current);
      }


    }

    return result.toArray(new int[result.size()][]);
  }
}
