package baekjoon.bit;

import java.io.IOException;
import java.util.Arrays;

public class Test {

  public static void main(String[] args) throws IOException {

    int[][] arr = {
        {1, 3},
        {5, 3},
        {2, 2},
        {3, 1},
        {4, 5}
    };

//    Arrays.sort(arr, new Comparator<int[]>() {
//      @Override
//      public int compare(int[] o1, int[] o2) {
//        if (o1[0] == o2[0]) {
//          return Integer.compare(o1[1], o2[1]);
//        } else {
//          return Integer.compare(o1[0], o2[0]);
//        }
//      }
//    });

    Arrays.sort(arr, (o1, o2) -> {
      if (o1[0] == o2[0]) {
        return Integer.compare(o1[1], o2[1]);
      } else {
        return Integer.compare(o1[0], o2[0]);
      }
    });

  }
}
