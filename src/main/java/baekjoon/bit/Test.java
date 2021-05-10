package baekjoon.bit;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

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




    List<Integer> q = Arrays.asList(2, 5, 1, 3, 4);


    int[] a = new int[q.size()];
    for (int i = 0; i < q.size(); i++) {
      a[i] = q.get(i);
    }

    // Not Enough
    int swap = 0;

    for (int i = 0; i < a.length - 1; i++) {
      // swap
      if (a[i] != i + 1) {
        // over
        if ((i + 1 - a[i]) < -2) {
          System.out.println("Too chaotic");
          break;
        }
        int tmp = a[i];
        a[i] = a[i + 1];
        a[i + 1] = tmp;

        swap++;
      }
    }
    System.out.println(swap);
  }
}
