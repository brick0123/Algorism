package practice.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sort {

  public static void main(String[] args) {
    List<int[]> list = new ArrayList<>();
    list.add(new int[]{1, 2, 3, 5});

    int[][] ints = list.toArray(new int[1][]);

    System.out.println("size = " + ints[0].length);

    int[][] arr = {{1, 3}, {2, 3}, {1, 2}};

    System.out.println(arr[0][1]);
//    Arrays.sort(arr, Comparator.comparingInt(o -> o[0]));
    Arrays.sort(arr, (o1, o2) -> Integer.compare(o1[0], o2[0]));


    Arrays.sort(arr, (o1, o2) -> {
      if (o1[0] == o2[0]) {
        return Integer.compare(o1[1], o2[1]);
      } else {
        return Integer.compare(o1[0], o2[0]);
      }
    });

    System.out.println(Arrays.deepToString(arr));
  }

  public void test(int[][] arr) {
  }

}
